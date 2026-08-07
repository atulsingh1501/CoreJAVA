package Exercise;

public class Ex3_printf {

        public static void main(String[] args) {

            /*
             * =========================================================
             * printf() = Print Formatted Output
             * =========================================================
             *
             * Syntax:
             * System.out.printf("format", values);
             *
             * Example:
             * System.out.printf("%d", 10);
             *
             * Format structure:
             * %[flags][width][.precision]specifier
             *
             * %           - start of format
             * flags       - optional formatting rules
             * width       - minimum total width
             * .precision  - digits after decimal (for floating numbers)
             * specifier   - data type
             */

            // =========================================================
            // %d  -> integer (byte, short, int, long)
            // =========================================================

            int age = 23;

            System.out.printf("Age: %d%n", age);
            // Output: Age: 23


            // =========================================================
            // %s -> String
            // =========================================================

            String name = "Atul";

            System.out.printf("Name: %s%n", name);
            // Output: Name: Atul


            // =========================================================
            // %c -> character
            // =========================================================

            char grade = 'A';

            System.out.printf("Grade: %c%n", grade);
            // Output: Grade: A


            // =========================================================
            // %b -> boolean
            // =========================================================

            boolean isPlaced = false;

            System.out.printf("Placed: %b%n", isPlaced);
            // Output: Placed: false


            // =========================================================
            // %f -> floating point (float/double)
            // =========================================================

            double cgpa = 8.4567;

            System.out.printf("CGPA: %f%n", cgpa);
            // Output: CGPA: 8.456700
            // Default: 6 digits after decimal


            // =========================================================
            // %.2f -> precision
            // =========================================================

            System.out.printf("CGPA: %.2f%n", cgpa);
            // Output: CGPA: 8.46
            // .2 means 2 digits after decimal


            // =========================================================
            // %.1f
            // =========================================================

            System.out.printf("CGPA: %.1f%n", cgpa);
            // Output: CGPA: 8.5


            // =========================================================
            // %n -> new line (recommended)
            // =========================================================

            System.out.printf("Hello%nWorld%n");

            // Output:
            // Hello
            // World


            // =========================================================
            // WIDTH
            // %10s  -> total width 10
            // =========================================================

            System.out.printf("%10s%n", "Java");

            // Output:
            //       Java
            // 6 spaces + Java = 10 characters


            // =========================================================
            // %-10s -> left aligned
            // =========================================================

            System.out.printf("%-10sEND%n", "Java");

            // Output:
            // Java      END


            // =========================================================
            // %5d -> width for integers
            // =========================================================

            System.out.printf("%5d%n", 42);

            // Output:
            //    42


            // =========================================================
            // %05d -> leading zeros
            // =========================================================

            System.out.printf("%05d%n", 42);

            // Output:
            // 00042


            // =========================================================
            // Real-world example: IDs
            // =========================================================

            int id1 = 1;
            int id2 = 23;
            int id3 = 456;

            System.out.printf("%04d%n", id1); // 0001
            System.out.printf("%04d%n", id2); // 0023
            System.out.printf("%04d%n", id3); // 0456


            // =========================================================
            // Multiple values in one printf
            // =========================================================

            String item = "Book";
            double price = 250.5;
            int quantity = 3;

            System.out.printf("Item: %s | Price: %.1f | Qty: %d%n",
                    item, price, quantity);

            // Output:
            // Item: Book | Price: 250.5 | Qty: 3


            // =========================================================
            // Table formatting
            // =========================================================

            System.out.printf("%-10s %10s%n", "Name", "Marks");
            System.out.printf("%-10s %10d%n", "Atul", 95);
            System.out.printf("%-10s %10d%n", "Rahul", 88);

            /*
             * Output:
             * Name            Marks
             * Atul               95
             * Rahul              88
             */


            // =========================================================
            // Important flags
            // =========================================================

            // + shows sign
            System.out.printf("%+d%n", 50);   // +50
            System.out.printf("%+d%n", -50);  // -50

            // space before positive numbers
            System.out.printf("% d%n", 50);   //  50

            // comma separator
            System.out.printf("%,d%n", 1000000); // 1,000,000


            // =========================================================
            // Width + precision together
            // %8.2f
            // =========================================================

            double num = 123.456;

            System.out.printf("%8.2f%n", num);

            // Output:
            //   123.46
            //
            // 8  -> total width
            // .2 -> 2 digits after decimal


            // =========================================================
            // Escape percent sign
            // =========================================================

            System.out.printf("Progress: 80%% complete%n");

            // Output:
            // Progress: 80% complete


            // =========================================================
            // Quick memory trick
            // =========================================================
            //
            // %s  -> String
            // %d  -> Integer
            // %f  -> Decimal
            // %c  -> Character
            // %b  -> Boolean
            // %n  -> New line
            //
            // .2  -> 2 decimal digits
            // 05  -> width 5 with leading zeros
            // -   -> left align
            // +   -> show sign
            // ,   -> comma separator
            // %%  -> print %
            // =========================================================

        }
    }

