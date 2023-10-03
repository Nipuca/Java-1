package homework1;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

        Random random = new Random();

        int num1 = -20;
        int num2 = 20;

        int count = 1;

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(num2 - num1 + 1) + num1;
            System.out.println(randomNumber);
        }
    }
}
