package ExceptionHandling;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class Ex2 {

    public static void main(String[] args) {

        int age = 15;

        try {

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }

            System.out.println("Eligible");

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }
    }
}