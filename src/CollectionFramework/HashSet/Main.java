package CollectionFramework.HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //HashSet is a class in Java's Collection Framework that stores unique elements.
        // Creating a HashSet of Integer
        HashSet<Integer> numbers = new HashSet<>();

        // =========================
        // 1. add() - Add elements
        // =========================

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

        // =========================
        // 2. Duplicate elements
        // =========================

        numbers.add(10); // 10 is already present
        // So it will NOT be added again

        System.out.println(numbers);

        // =========================
        // 3. contains() - Check element
        // =========================

        System.out.println(numbers.contains(20));
        // true

        System.out.println(numbers.contains(50));
        // false

        // =========================
        // 4. remove() - Remove element
        // =========================

        numbers.remove(20);

        System.out.println(numbers);

        // =========================
        // 5. size() - Number of elements
        // =========================

        System.out.println(numbers.size());

        // =========================
        // 6. isEmpty() - Check empty
        // =========================

        System.out.println(numbers.isEmpty());
        // false

        // =========================
        // 7. Loop through HashSet
        // =========================

        for (int num : numbers) {
            System.out.println(num);
        }

        // =========================
        // 8. clear() - Remove everything
        // =========================

        numbers.clear();

        System.out.println(numbers);
        // []
        //| Method | What it does |
        //|---|---|
        //| `add()` | Adds an element |
        //| `remove()` | Removes an element |
        //| `contains()` | Checks whether element exists |
        //| `size()` | Returns number of elements |
        //| `isEmpty()` | Checks whether set is empty |
        //| `clear()` | Removes all elements |
    }
}
