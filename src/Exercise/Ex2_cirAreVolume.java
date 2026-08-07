package Exercise;
import java.util.*;
public class Ex2_cirAreVolume {
    static void main() {
         Scanner scanner = new Scanner(System.in);

         //circumference = 2 * Math.PI*radius;  or  2PIr
        //area = Math.PI * Math.pow(radius,2);  or  PIr^2
        //volume = (4.0/3.0)=Math.PI(radius,3); or  4/3PIr^3

        double circumference;
        double area;
        double volume;
        double radius;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of circle is: " + circumference + " cm");

        area = Math.PI * Math.pow(radius,2);
        System.out.println("the area of sphere is: " + area + " cm²" );

        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.println("volume of a sphere is " + volume + " cm³"  );

        scanner.close();

    }
}
