import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.print("Введіть вираз: ");
            String in = scanner.nextLine();

            if (in.equals("q")) {
                System.out.println("Вихід з калькулятора");
                break;
            }

            try {
                result = evaluateExpression(in);
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }
    }

    public static double evaluateExpression(String expression) throws Exception {
        String[] num = expression.split(" ");
        if (num.length != 3) {
            throw new Exception("Неправильний формат виразу.");
        }

        double operand1 = Double.parseDouble(num[0]);
        double operand2 = Double.parseDouble(num[2]);
        String operator = num[1];

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    throw new Exception("ылення на 0 неможливо.");
                }
            default:
                throw new Exception("Невідома операція.");
        }
    }
}
