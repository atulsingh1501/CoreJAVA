package CollectionFramework.ArrayList;
import java.util.*;
public class ExerciseList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(45);
        list.add(23);
        list.add(67);
        list.add(12);

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("Largest = " + max);
    }
}
