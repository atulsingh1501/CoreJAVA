package ExceptionHandling;

public class Throws {
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible");
        }
    }
    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
