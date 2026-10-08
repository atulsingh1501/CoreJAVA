package Threading;

// A class that represents a task
class MyTask implements Runnable {

    private String taskName;

    // Constructor
    MyTask(String taskName) {
        this.taskName = taskName;
    }

    // This method contains the work that the thread will perform
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(taskName + " - Step " + i);

            try {
                // Pause the current thread for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }

        System.out.println(taskName + " finished!");
    }
}


public class Multithreading {

    public static void main(String[] args) {

        // Create two different tasks
        MyTask task1 = new MyTask("Downloading File");
        MyTask task2 = new MyTask("Playing Music");

        // Create two threads and give them the tasks
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start both threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread is running...");
    }
}
