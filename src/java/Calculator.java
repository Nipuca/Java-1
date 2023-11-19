import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть математичний вираз: ");
        String expression = scanner.nextLine();

        try {
            double result = evaluateExpression(expression);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public static double evaluateExpression(String expression) {
        try {
            // Використання вбудованих функцій для обчислення виразу
            return eval(expression);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Ділення на нуль");
        } catch (Exception e) {
            throw new IllegalArgumentException("Невірний вираз");
        }
    }

    private static double eval(String expression) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length()) throw new IllegalArgumentException("Невірний вираз");
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+')) x += parseTerm(); // Додавання
                    else if (eat('-')) x -= parseTerm(); // Віднімання
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('*')) x *= parseFactor(); // Множення
                    else if (eat('/')) x /= parseFactor(); // Ділення
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // Унарний плюс
                if (eat('-')) return -parseFactor(); // Унарний мінус

                double x;
                int startPos = pos;
                if (eat('(')) { // Дужки
                    x = parseExpression();
                    eat(')');
                } else if (Character.isDigit(ch) || ch == '.') { // Числа
                    while (Character.isDigit(ch) || ch == '.') nextChar();
                    x = Double.parseDouble(expression.substring(startPos, pos));
                } else {
                    throw new IllegalArgumentException("Невірний вираз");
                }

                return x;
            }
        }.parse();
    }
}
