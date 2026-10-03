package OOPs.WrapperClass;
import java.util.ArrayList;
public class List {
    public static void main(String[] args) {
        // ArrayList needs an object type
        // So we use Integer instead of int
      ArrayList<Integer> nums = new ArrayList<>();
      nums.add(10);
      nums.add(20);
      nums.add(30);
      System.out.println(nums);

    }
}
