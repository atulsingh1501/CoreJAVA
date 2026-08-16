package PROJRCTS;

import java.util.Scanner;

public class P7_whileQuiteGame {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Create a String variable named response
        // Initially it is empty ("")
        String response = "";

        // Keep running the loop while response is NOT equal to "Q"
        // ! means NOT
        // response.equals("Q") -> checks if response is "Q"
        // !response.equals("Q") -> checks if response is NOT "Q"
        while (!response.equals("Q")) {

            // Print a message every time the loop runs
            System.out.println("You are playing a game");

            // Ask the user how to quit
            System.out.print("Press Q to quit: ");

            // Read one word from the keyboard
            // Convert it to uppercase
            // So both 'q' and 'Q' become 'Q'
            response = sc.next().toUpperCase();
        }

        // This line runs only after the loop stops
        // The loop stops when response becomes "Q"
        System.out.println("You have quit the game");

        // Close the Scanner to free resources
        sc.close();
    }
}
//while(true) {
//
//        System.out.println("You are playing a game");
//    System.out.print("Press Q to quit: ");
//
//response = sc.next().toUpperCase();
//
//    if(response.equals("Q")) {
//        break; // stop the loop
//        }
//        } also this is correct