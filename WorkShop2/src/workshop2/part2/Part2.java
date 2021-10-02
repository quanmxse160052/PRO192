package workshop2.part2;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {

        String code1;
        code1 = getStudentCode("Enter a student code");
        System.out.println(code1);
    }

    public static String getStudentCode(String msg) {
        boolean flag = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.printf("%s: ", msg);
                result = sc.nextLine();
                if (result.matches("SE[0-9][0-9][0-9]")) {
                    flag = false;
                } else {
                    throw new InputStringException("Wrong code form!");
                }
            } catch (InputStringException e) {
                System.out.println(e);

            }

        } while (flag);
        return result;

    }

}
