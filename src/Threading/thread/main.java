package Threading.thread;


import java.util.Scanner;

public class main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        myrunnable myrunnable = new myrunnable();
        Thread thread = new Thread(myrunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 Seconds to enter you name");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        sc.close();
    }
}
