package DateAndTime;

import java.time.LocalTime;

public class Time {
    static void main() {
        LocalTime time = LocalTime.now();

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
    }
}
