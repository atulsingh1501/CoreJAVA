package Exercise;

import java.util.*;

public class Ex1_hypotenusOfTriangle {
    static void main() {
        //HYPOTENUSE c = Math.sqrt(a2 + b2)

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the length of a side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of a side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The Hypotenuse of the triangle is: "+ c + "cm");




      scanner.close();
    }
}
