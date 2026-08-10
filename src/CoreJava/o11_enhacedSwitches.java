package CoreJava;

import java.util.*;

public class o11_enhacedSwitches {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the days of the week: ");
        String day = scanner.nextLine();

//        switch(day){
//            case "mon"-> System.out.println("its a weekday");
//            case "tue"-> System.out.println("its a weekday");
//            case "wed"-> System.out.println("its a weekdays");
//            case "thrus"-> System.out.println("its a weekday");
//            case "fri"-> System.out.println("its a weekday");
//            case "sat"-> System.out.println("chuttti haiiii");
//            case "sun"-> System.out.println("chuttti haiiii");
//            default -> System.out.println("aisha koii din hota hee nhi h");
        switch(day){
            case "mon","tue","wed","thrus","fri" -> System.out.println("its a weekday");
            case "sat" , "Sun" -> System.out.println("its a weekend");
            default -> System.out.println("aisha koii din hota hee nhi h");

        }
    }
}
