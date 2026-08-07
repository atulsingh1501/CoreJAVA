import java.util.*;

public class o7_printF {
    static void main() {

        //printf() = is a method use to format output
        // %[flags][width][.precision][specifier-character]
        int marks = 95;
        double cgpa = 8.4567;

        System.out.println(marks);
        System.out.printf("CGPA: %.2f%n", cgpa);//.2f means print 2 digit after decimal

        String item = "Book";
        double cost = 250.5;
        int num = 167;

        System.out.printf("Item: %s %nCost: %.1f %nNumber: %d%n",item,cost,num);

        String name = "Spongebob";
        char fisrtLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed  = true;

        System.out.printf("Hello %s %nYour name start with a %c %nyour are %d years old %nyour are %.1f inches tall %nEmployed %b\n",name,fisrtLetter,age,height,isEmployed);


        // =========================================================
        // Real-world example: IDs
        // =========================================================

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;

        System.out.printf("%04d%n", id1); // 0001
        System.out.printf("%04d%n", id2); // 0023
        System.out.printf("%04d%n", id3); // 0456


        // + shows sign
        System.out.printf("%+d%n", 50);   // +50
        System.out.printf("%+d%n", -50);  // -50

        // space before positive numbers
        System.out.printf("% d%n", 50);   //  50

        // comma separator
        System.out.printf("%,d%n", 1000000); // 1,000,000

    }
}
