package PROJRCTS;

import java.util.*;

public class P4_weightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;
        System.out.print("choose the option you want to calculate (1 for KGs or 2 for Lbs): ");
        choice = scanner.nextInt();
        if(choice == 1 ){
            System.out.println("Enter the wight in lbs");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("The new weight in kgs: %.2f" , newWeight);

        }
        else if (choice == 2){
                System.out.println("Enter the wight in kgs");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462262;
                System.out.printf("The new weight in lbs: %.2f" , newWeight);

            }
        else{
            System.out.println("that was not a valid choice");
        }
        scanner.close();
    }
}
