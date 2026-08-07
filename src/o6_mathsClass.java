public class o6_mathsClass {

    public static void main(String[] args) {

        double result;

        // Math.PI -> returns the value of pi (3.141592...)
        System.out.println(Math.PI);

        // Math.E -> returns the value of Euler's number (2.718281...)
        System.out.println(Math.E);

        // Math.pow(a, b) -> raises a to the power of b
        result = Math.pow(2, 3);
        System.out.println(result);

        // Math.abs(x) -> returns the positive value
        result = Math.abs(-55);
        System.out.println(result);

        // Math.sqrt(x) -> returns square root
        result = Math.sqrt(9);
        System.out.println(result);

        // Math.round(x) -> rounds to nearest whole number
        result = Math.round(3.14);
        System.out.println(result);

        // Math.ceil(x) -> rounds up
        result = Math.ceil(3.14);
        System.out.println(result);

        // Math.floor(x) -> rounds down
        result = Math.floor(3.99);
        System.out.println(result);

        // Math.max(a, b) -> returns larger value
        result = Math.max(10, 20);
        System.out.println(result);

        // Math.min(a, b) -> returns smaller value
        result = Math.min(10, 20);
        System.out.println(result);
    }
}