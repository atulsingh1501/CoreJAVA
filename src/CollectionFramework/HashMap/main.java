package CollectionFramework.HashMap;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Atul");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        System.out.println(students.get(101));

        System.out.println(students.containsKey(102));

        students.remove(103);
        students.put(104, "paddu");
        System.out.println(students);
    }
}
