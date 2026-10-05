package ExceptionHandling;

public class Example {
    static void main() {
        try {
            String username = "atul";
            String password = "1234";

            if (!password.equals("admin")) {
                throw new Exception("Invalid password");
            }

            System.out.println("Login successful");
        }
        catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }

}
