import java.util.*;
public class condiTional {
    static void main() {
        // if statement = run a block of code if conditions is true

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();
//Group 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name! ");
        }else{
            System.out.println("hello " + name + "");
        }

// Group 2
        if(age >= 18){
            System.out.println("you are adult!");
        }else if (age >= 65){
            System.out.println("You are a senior");
        }
        else if (age < 0){
            System.out.println("you haven't been birn yet!");
        }else if (age == 0){
            System.out.println("you are a baby!!");
        }
        else{
            System.out.println("you are a child!!");
        }
        //Group 3
        if(isStudent){
            System.out.println("you are a student!");
        }else{
            System.out.println("your are NOT a student!");
        }
        scanner.close();
    }
}
