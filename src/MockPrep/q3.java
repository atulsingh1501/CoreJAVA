package MockPrep;
import java.util.*;
import java.util.Scanner;

public class q3 {
    //remove consecutive duplicate
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                result.append(s.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
