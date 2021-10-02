package workshop1;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        playWithOperators();
    }

    public static void playWithOperators() {
        float num1;
        float num2;
        char op;
        num1 = getFloat("Enter number 1: ");
        num2 = getFloat("Enter number 2: ");
        op = getOperator("Enter operator:");

        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;

        }
    }

    public static float getFloat(String msg) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        float result = 0;
        do {
            try {
                System.out.printf("%s", msg);
                result = Float.parseFloat(sc.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println("Please enter a float number!!!");
            }
        } while (flag);
        return result;
    }

    public static char getOperator(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s\n", msg);
        int choice;
        boolean flag = true;
        char result = ' ';
        do {
            System.out.println("1. + ");
            System.out.println("2. - ");
            System.out.println("3. * ");
            System.out.println("4. / ");
            choice = (int) getFloat("Select your choice: ");
            switch (choice) {
                case 1:
                    result = '+';
                    break;
                case 2:
                    result = '-';
                    break;
                case 3:
                    result = '*';
                    break;
                case 4:
                    result = '/';
                    break;

            }
        } while (choice > 0 && choice < 4);
        return result;
    }
}
