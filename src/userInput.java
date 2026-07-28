import java.util.*;

public class userInput {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Entr your age: ");
        int age = scanner.nextInt();

        System.out.print("What is you gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old");
        System.out.println("your gpa is: " + gpa);

        if(isStudent){
            System.out.println("you are enrolled as a student");
        }else{
            System.out.println("You are NOT enrolled");
        }

        scanner.close();
    }
}
