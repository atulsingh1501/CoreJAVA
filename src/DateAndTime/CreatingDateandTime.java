package DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class CreatingDateandTime {
    static void main() {
        LocalDate date = LocalDate.of(2026, 10, 6);

        System.out.println(date);

        LocalTime time = LocalTime.of(7,23,23);
        System.out.println(time);
    }
}
