package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    static void main() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(25);
        nums.add(2);
        nums.add(45);
        nums.add(4);
        System.out.println(nums);
        System.out.println(nums.contains(2));// check that array list conatins this element!! if conatin then it print true
        System.out.println(nums.add(10));  // Add element
        System.out.println(nums.get(0));// Get element
        Collections.sort(nums);//this sort collection
        System.out.println("the sorted collection  are: "+nums);

        nums.set(0, 20);// Update element and overwite old with new elemnt
        nums.remove(1); // Remove element
        System.out.println(nums);
        System.out.println(nums.size()); // Number of elements
        System.out.println(nums.isEmpty()); // Check empty
        nums.clear();   // Remove all elements


    }
}
