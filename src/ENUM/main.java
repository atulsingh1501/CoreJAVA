package ENUM;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String reponse = sc.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(reponse);

            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY , SUNDAY -> System.out.println("It is the weekend");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day");
        }

        sc.close();
    }
}
