package CoreJava;

import java.util.Arrays;
import java.util.Scanner;

public class o18_Arrays {
    static void main() {
    Scanner sc = new Scanner(System.in);
//    String []foods = new String[3];
        System.out.print("Enter the numer of food you want: ");
        int size = sc.nextInt();
        String [] foods = new String[ size];
        sc.nextLine();

    for(int i = 0; i < foods.length ;i++) {
        System.out.println("Enter a food");
        foods[i] = sc.nextLine();
    }
    for(String food : foods) {
        System.out.println(food); // enhaced for loop //The enhanced for loop (also called a for-each loop) is used to easily iterate through arrays or collections.
    }
        for(int i = 0; i < foods.length; i++) {
            // i exists only here
            System.out.println(foods[i]); //print every element of array one by one for at every i
        }
        System.out.println(Arrays.toString(foods)); // print whole array
    }
}
