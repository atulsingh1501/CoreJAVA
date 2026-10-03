package OOPs.WrapperClass;
import java.util.*;
public class main {
    public static void main(String[] args) {

        // =========================
        // 1. Primitive
        // =========================

        int num = 10;


        // =========================
        // 2. Autoboxing
        // int → Integer
        // =========================

        Integer number = num;


        // =========================
        // 3. Unboxing
        // Integer → int
        // =========================

        int value = number;


        // =========================
        // 4. Wrapper with ArrayList
        // =========================

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);


        // =========================
        // 5. String → int
        // =========================

        String str = "100";

        int converted = Integer.parseInt(str);


        // =========================
        // 6. Character methods
        // =========================

        char ch = '5';

        System.out.println(Character.isDigit(ch));
        // true


        // Print results
        System.out.println(number);
        System.out.println(value);
        System.out.println(nums);
        System.out.println(converted);
    }
}

