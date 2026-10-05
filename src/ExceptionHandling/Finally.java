package ExceptionHandling;

public class Finally {
    static void main() {
        try {
            int x = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Finally executed");
        }
    }
}
