package CoreJava;

import java.util.Scanner;

public class o20_2dArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take rows and columns from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Create 2D array
        int[][] numbers = new int[rows][columns];

        // Take elements from user
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print("Enter element: ");
                numbers[i][j] = sc.nextInt();
            }
        }

        // Print 2D array
        System.out.println("Your array:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }
    }
}