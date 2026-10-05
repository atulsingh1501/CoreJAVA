package ExceptionHandling;

public class TryCatch {
    static void main() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch(ArithmeticException e) {
            System.out.println("error: Cannot divided by Zero");
        }
        System.out.println("try something different number for b");
    }
}
