package PROJRCTS;

import java.util.*;

public class P3_compoundInterestCalculator {
    static void main() {

        //compund interest calculator

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the principle amount: ");
        double principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compunded per year: ");
        int timesCompunded = scanner.nextInt();

        System.out.print("Enter the # of year: ");
        int years = scanner.nextInt();

        double amount = principle *  Math.pow(1 + rate/timesCompunded,timesCompunded * years);
        System.out.printf("The amount after %d years is $%.2f",years,amount);


        scanner.close();
    }

}
