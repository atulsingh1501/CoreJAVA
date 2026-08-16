package PROJRCTS;
import java.util.*;
public class P8_numberGuessingGame {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempt = 0;
        int max = 20;
        int min = 0;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Welcome! we are playing Number guessing game 😏");
        System.out.println("guess a number between 1 - 20 : ");
        guess = scanner.nextInt();

//       do{
//           System.out.print("Enter a guess🐸 :");
//           guess = scanner.nextInt();
//           attempt++;
//
//           if(guess < randomNumber){
//               System.out.println("TOO LOW! try again😒");
//           }else if(guess > randomNumber){
//               System.out.println("Too High! try again babe😁");
//           }else{
//               System.out.println("you wons but after " + attempt + " attempts🤣");
//           }
//       }while(guess != randomNumber);

        while(guess != randomNumber){
            attempt++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! try again😒");
            } else if(guess > randomNumber){
                System.out.println("Too High! try again babe😁");
            }

            System.out.print("Enter another guess: ");
            guess = scanner.nextInt();
        }

        System.out.println("You won after " + attempt + " attempts 🎉");

    }
}
