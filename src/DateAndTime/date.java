package DateAndTime;
import java.time.LocalDate;

public class date {
    static void main() {
        LocalDate date = LocalDate.now();
        System.out.println(date);// for date
        System.out.println(date.getYear());//for only year
        System.out.println(date.getMonth());//for current month
        System.out.println(date.getDayOfMonth());//for how many date in this month
        System.out.println(date.getDayOfWeek());//day of week

        //adding and subtracting date,year,month

        System.out.println(date.plusDays(5));
        System.out.println(date.minusDays(2));
        System.out.println(date.plusMonths(1));
        System.out.println(date.minusYears(1));
        System.out.println(date.plusYears(3));
    }
}
