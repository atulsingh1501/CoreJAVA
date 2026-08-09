package CoreJava;
import java.util.*;
public class o8_StringMethods {
    static void main() {
//        String name = "Atulya Singh";
//        System.out.println(name.length());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.charAt(2));
//        System.out.println(name.indexOf("S"));
//        System.out.println(name.contains("u"));

        /*  -----------------------------------------------------------------------
         1  |  program for checking that string contain the characters .contains()  |
            -----------------------------------------------------------------------

        System.out.print("enter the character to check: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        if(name.contains(text)){
            System.out.println("String name conatins the character");
        }else{
            System.out.println("String name cannot contains the character you needed");
        }
        scanner.close();
        */

        /*          -----------------------------------------------------------------------
                  2  | program for checking that string is equal to another string .equals() |
                    -----------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first string: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter your second string: ");
        String name2 = scanner.nextLine();
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("string 1 is equal to string 2");
        }else{
            System.out.println("not equals");
        }

        */

         /*          --------------------------------------------------------------------------------------------------------
                  2 | program for checking that string is start with and end with which char startsWith(ch) and endsWith(ch2)  |
                    ---------------------------------------------------------------------------------------------------------

        Scanner scanner = new Scanner (System.in);
        System.out.print("write the string: ");
        String s = scanner.nextLine();
        System.out.print("write the char to check it start with: ");
        String ch = scanner.next();
        System.out.print("write the char to check it end with: ");
        String ch2 = scanner.next();
        if(s.startsWith(ch)){
            System.out.println("yupppp start with the given");
            if(s.endsWith(ch2)){
                System.out.println(" and also end with the character you typed");
            }else{
                System.out.println("but not end the charcter you typed" );
            }

        }else{
            System.out.println("nope not start with given character");
            if(s.endsWith(ch2)){
                System.out.println(" but end with the character you typed");
            }else{
                System.out.println("and also not end with the charcter you typed" );
            }
        }
*/

    }
}
