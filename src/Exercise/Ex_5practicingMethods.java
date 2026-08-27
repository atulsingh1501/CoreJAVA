package Exercise;

import java.util.Scanner;

public class Ex_5practicingMethods {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num = sc.nextInt();
       if(isEven(num)){
           System.out.println("your number is even");
       }else{
           System.out.println("your number is odd");
       }

    }

    static boolean isEven(int a){
       if(a % 2 == 0){
           return true;
       }else{
           return false;
       }
    }
}
