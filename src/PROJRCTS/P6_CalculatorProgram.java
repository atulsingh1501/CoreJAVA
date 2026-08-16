package PROJRCTS;

import java.util.*;

public class P6_CalculatorProgram {
    static void main() {


        int num1;
        int num2;
        char operator;
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        num1 = scanner.nextInt();

        System.out.print("enter operaters (+,-,/,*,^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number : ");
        num2 = scanner.nextInt();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '^' -> result = Math.pow(num1,num2);

        }
        System.out.println("your answer is: " + result);
        scanner.close();
    }
}
