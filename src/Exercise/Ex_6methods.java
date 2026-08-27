package Exercise;

import java.util.Scanner;

public class Ex_6methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        int result = greater(num1, num2);

        System.out.println("Greater number is: " + result);

//        if (result == num1) {
//            System.out.println("num1 is greater than num2");
//        } else {
//            System.out.println("num2 is greater than num1");
//        }
    }


    static int greater(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
