package ExceptionHandling;

public class MultipleCatch {
    static void main() {
        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
    }
}
