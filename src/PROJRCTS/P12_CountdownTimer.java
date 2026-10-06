package PROJRCTS;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class P12_CountdownTimer {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The # no of Second to COUNTDOWN from: ");
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = sc.nextInt();
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("HAPPY NEW YEAR!!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task,0,1000);
    }
}
