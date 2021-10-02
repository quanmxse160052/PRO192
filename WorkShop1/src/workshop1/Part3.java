
package workshop1;

import java.util.Scanner;

public class Part3 {
    
    public static void main(String[] args) {
        String[] listName;
        int listLen;
        listLen = getInt("Enter the length: ");
        listName = new String[listLen];
        for (int i = 0; i < listLen; i++) {
            listName[i] = getString("Enter the name " + (i + 1));
        }
        for (int i = 0; i < listLen; i++) {
            System.out.println(listName[i].toUpperCase());
        }
        
        
    }
    public static String getString(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", msg);
        return sc.nextLine();
    }
    public static int getInt(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        int result = 0;
        boolean flag = true;
        do {
            try {
                result = Integer.parseInt(sc.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println("Please enter a number!!!");
            }

        } while (flag);

        return result;

    }
       
}
