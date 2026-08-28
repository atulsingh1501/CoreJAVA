package PROJRCTS;

import java.util.Scanner;

public class P9_bankingProgram {
    static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
       double balance = 10000;
       boolean isRunning = true;
       int choice;
       while(isRunning) {
           System.out.println("***************");
           System.out.println("BANKING PROGRAM");
           System.out.println("***************");
           System.out.println("1. Show Balance");
           System.out.println("2. Deposit");
           System.out.println("3. Withdraw");
           System.out.println("4. Exit");
           System.out.println("***************");

           System.out.print("Enter you choice (1-4): ");
           choice = scanner.nextInt();
           switch (choice) {
               case 1 -> showbalance(balance);
               case 2 -> balance += deposit();
               case 3 -> balance = balance - withdraw(balance);
               case 4 -> {
                   System.out.println("You exit!!");
               isRunning = false;
               }

               default -> System.out.println("INVALID CHOICE");
           }
       }
       System.out.println("***************************");
       System.out.println("Thank you!! have a nice day");
       System.out.println("***************************");
       scanner.close();
    }
    static void showbalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f%n"  ,  balance);
    }
    static double deposit(){
       double amount;

        System.out.print("Enter and amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }

    }
    static double withdraw(double balance){
       double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount can't be neagtive");
            return 0;
        }else{
            return amount;
        }
    }

}
