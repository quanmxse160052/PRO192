package workshop2.part1;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {

        int num1;
        num1 = getInt("Give me an int number");
        System.out.println("num1");

    }

    public static int getInt(String msg) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int result = 0;
        do {
            try {
                System.out.printf("%s: ", msg);
                result = sc.nextInt();
                if (result < 1) {
                    throw new InputNumberException("The number must greater or equal 1!");
                } else {
                    flag = false;
                }
            } catch (InputNumberException e) {
                System.out.println(e);
            }
        } while (flag);
        return result;
    }

}
