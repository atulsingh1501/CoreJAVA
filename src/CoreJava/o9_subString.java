package CoreJava;

import java.util.*;
public class o9_subString {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);

        System.out.println("this is your username: " + username);
        System.out.println("this is the domain: " + domain);


        scanner.close();
    }
}
