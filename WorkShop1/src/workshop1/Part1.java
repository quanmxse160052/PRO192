package workshop1;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {

        int matrix[][];
        int rows;
        int colums;
     
        int choice;
        rows = getInt("Enter the number of rows: ");
        colums = getInt("Enter the number of colum: ");
        matrix = new int[rows][colums];
        do {

            System.out.println("1. Enter the elements of the matrix: ");
            System.out.println("2. Get sum of values");
            System.out.println("3. Get average value");
            System.out.println("4. Print out matrix");
            System.out.println("Others: Quit!");
            choice = getInt("Select your choice: ");
            switch (choice) {
                case 1:
                    inputMaxtrix(matrix, rows, colums);
                    break;
                case 2:
                    System.out.printf("Sum: %d\n", getSumOfMatrix(matrix, rows, colums));
                    break;
                case 3:
                    System.out.printf("Average value: %f\n", (double) getSumOfMatrix(matrix, rows, colums) / (rows * colums));
                    break;
                case 4:
                    printMatrix(matrix, rows, colums);
                    break;

            }

        } while (choice > 0 && choice < 5);
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

    public static void inputMaxtrix(int arr[][], int rows, int colum) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                arr[i][j] = getInt("Enter value of a[" + i + "]" + "[" + j + "]: ");
            }
        }
    }

    public static void printMatrix(int arr[][], int rows, int colum) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
        }
        System.out.println("");
    }

    public static int getSumOfMatrix(int arr[][], int rows, int colum) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

}
