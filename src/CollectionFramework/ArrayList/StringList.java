package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StringList {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hina");
        list.add("Atul");
        list.add("Aditi");
        list.add("Siddhi");
        list.add("Tanya");
        list.add("Sunidhi");
        System.out.println(list);
        list.set(5,"Nidhi");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        for(int i = 0 ;i <list.size();i++){
            System.out.println(list.get(i));

        }
    }
}
