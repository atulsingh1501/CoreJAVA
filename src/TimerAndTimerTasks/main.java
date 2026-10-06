package TimerAndTimerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class main {
    static void main() {
        Timer time = new Timer();
        TimerTask task = new TimerTask() {
            int n = 3;
            @Override
            public void run() {
                System.out.println("hello bebe");
               n--;
               if(n<=0){
                   System.out.println("Task Complete");
                   time.cancel();
               }
            }
        };
        time.schedule(task,0,1000);
    }
}
