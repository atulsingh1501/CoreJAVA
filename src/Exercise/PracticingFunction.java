package Exercise;

import java.util.Scanner;

public class PracticingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second num: ");
        int b = scanner.nextInt();
        System.out.println("the max number is : " + youMax(a , b));

    }
    static int youMax(int a , int b){
       if(a > b){
           return a;
       }else{
           return b;
       }

    }
}
