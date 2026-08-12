package CoreJava;
import java.util.*;

public class o12_logical0perators {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome To Fight Club!! Enter your Age here: ");
        int age = sc.nextInt();

      /*  if(age >=18 && age <= 60) {//for && both condition will must be true for pinting the message.
            // if any will be false it will print nothing because false and true print false
            System.out.println("you are strong enough for Flight Club");
        }
        */

        // ❌ This condition is impossible
        // A number cannot be less than 18 AND greater than 60 at the same time
        // So isAge will always be false
        boolean isAge = (age < 18 && age > 60);

        // Check if the person is NOT allowed
        // If age is below 18 OR above 60, condition becomes true
        if (age < 18 || age > 60) {

            // This block runs for invalid ages
            System.out.println("You are NOT strong enough for Fight Club");

        } else {

            // This block runs for valid ages (18 to 60)
            System.out.println("You are strong enough for Fight Club");
        }

        // ! means NOT
        // isAge is always false
        // !false becomes true
        // Therefore this message will ALWAYS print
        if (!isAge) {
            System.out.println("Welcome to Fight Club sir !!");
        }

        sc.close();
    }
}