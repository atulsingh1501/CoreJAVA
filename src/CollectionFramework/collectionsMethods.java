package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsMethods {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Original: " + numbers);


        // ==========================================
        // 1. Collections.sort()
        // ==========================================

        // Sorts the list in ascending order
        Collections.sort(numbers);

        System.out.println("Sorted: " + numbers);
        // [10, 10, 20, 30, 40]


        // ==========================================
        // 2. Collections.reverse()
        // ==========================================

        // Reverses the order of elements
        Collections.reverse(numbers);

        System.out.println("Reversed: " + numbers);
        // [40, 30, 20, 10, 10]


        // ==========================================
        // 3. Collections.max()
        // ==========================================

        // Finds the largest element
        int maximum = Collections.max(numbers);

        System.out.println("Maximum: " + maximum);
        // 40


        // ==========================================
        // 4. Collections.min()
        // ==========================================

        // Finds the smallest element
        int minimum = Collections.min(numbers);

        System.out.println("Minimum: " + minimum);
        // 10


        // ==========================================
        // 5. Collections.frequency()
        // ==========================================

        // Counts how many times a particular element occurs
        int count = Collections.frequency(numbers, 10);

        System.out.println("10 occurs: " + count + " times");
        // 10 occurs: 2 times


        // ==========================================
        // 6. Collections.swap()
        // ==========================================

        // Swaps the elements at index 0 and index 1
        Collections.swap(numbers, 0, 1);

        System.out.println("After swap: " + numbers);


        // ==========================================
        // 7. Collections.shuffle()
        // ==========================================

        // Randomly changes the order of elements
        Collections.shuffle(numbers);

        System.out.println("After shuffle: " + numbers);


        // ==========================================
        // 8. Collections.fill()
        // ==========================================

        // Replaces every element with the given value
        Collections.fill(numbers, 100);

        System.out.println("After fill: " + numbers);
        // [100, 100, 100, 100, 100]
    }
}
