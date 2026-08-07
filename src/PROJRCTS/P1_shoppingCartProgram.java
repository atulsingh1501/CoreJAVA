package PROJRCTS;
import java.util.*;

public class P1_shoppingCartProgram {
    static void main() {
        Scanner scanner = new Scanner(System.in);
       String item;
       double price;
       int quantity;
       char currency = '$';
       double total;

        System.out.print("shopkeeper!!! what item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("buyer!! what was the price of each?: ");
        price = scanner.nextDouble();

        System.out.print("shopkeeper!! how many would you like to buy?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total is " + currency + total);



        scanner.close();
    }
}
