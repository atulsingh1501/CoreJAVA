package PROJRCTS;
import java.util.*;

public class P5_tempreatureConverter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;


        System.out.print("enter the temperature: ");
        temp = sc.nextInt();

        System.out.print("covert to celsius or faherenheit(C or F): ");
        unit = sc.next().toUpperCase();
        // (condition) ? true : false //syntax of ternary operater
        newTemp = (unit.equals("C")) ? (temp - 32) * 5  / 9 : (temp * 5 / 9) + 32;
        System.out.printf("%.1f°%S " , newTemp , unit);
    }

}
