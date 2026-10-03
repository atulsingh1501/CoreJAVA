package OOPs.WrapperClass;
import java.util.*;
public class Maps {
      public static void main(String[] args) {
          // Character = wrapper class of char
          // Integer = wrapper class of int
          HashMap<Character, Integer> map = new HashMap<>();
          char ch = 'a';
          // char automatically becomes Character
          // int automatically becomes Integer
            map.put(ch, 1);

            System.out.println(map);

    }
}
