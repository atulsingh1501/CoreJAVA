package OOPs.WrapperClass;
public class wrapperMethod {

    public static void main(String[] args) {

        // ============================================================
        //                    INTEGER METHODS
        // ============================================================

        /*
         * Integer is the Wrapper Class for primitive int.
         *
         * Primitive:
         *      int
         *
         * Wrapper:
         *      Integer
         *
         * Integer provides useful methods for working with numbers.
         */


        // ============================================================
        // 1. Integer.parseInt()
        // ============================================================

        /*
         * parseInt() converts a String containing a number
         * into a primitive int.
         *
         * Syntax:
         *
         *      Integer.parseInt(String)
         *
         * Example:
         *
         *      "123"  →  123
         *
         * Before conversion:
         *      "123" is a String
         *
         * After conversion:
         *      123 is an int
         */

        String str = "123";

        // Convert String "123" into primitive int 123
        int num1 = Integer.parseInt(str);

        System.out.println(num1);
        // Output: 123


        /*
         * Now num1 is an int.
         *
         * Therefore, we can perform mathematical operations.
         */

        System.out.println(num1 + 10);
        // Output: 133


        /*
         * IMPORTANT:
         *
         * Integer.parseInt("123")
         *
         * means:
         *
         *      String → int
         */


        // ============================================================
        // 2. Integer.valueOf()
        // ============================================================

        /*
         * valueOf() converts a String into an Integer object.
         *
         * Syntax:
         *
         *      Integer.valueOf(String)
         *
         * Example:
         *
         *      "123" → Integer object containing 123
         *
         * Difference:
         *
         * parseInt():
         *      String → int
         *
         * valueOf():
         *      String → Integer
         */

        String str2 = "123";

        // Convert String into an Integer object
        Integer num2 = Integer.valueOf(str2);

        System.out.println(num2);
        // Output: 123


        /*
         * Because Integer can automatically be converted
         * back to int when required, we can perform calculations.
         */

        System.out.println(num2 + 10);
        // Output: 133


        /*
         * IMPORTANT:
         *
         * Integer.valueOf("123")
         *
         * means:
         *
         *      String → Integer
         */


        // ============================================================
        // 3. Integer.max()
        // ============================================================

        /*
         * max() compares two numbers and returns
         * the larger number.
         *
         * Syntax:
         *
         *      Integer.max(number1, number2)
         *
         * Example:
         *
         *      Integer.max(10, 20)
         *
         * Java compares:
         *
         *      10 vs 20
         *
         * 20 is larger.
         */

        int maximum = Integer.max(10, 20);

        System.out.println(maximum);
        // Output: 20


        /*
         * Another example:
         */

        int a = 50;
        int b = 30;

        int bigger = Integer.max(a, b);

        System.out.println(bigger);
        // Output: 50


        // ============================================================
        // 4. Integer.min()
        // ============================================================

        /*
         * min() compares two numbers and returns
         * the smaller number.
         *
         * Syntax:
         *
         *      Integer.min(number1, number2)
         *
         * Example:
         *
         *      Integer.min(10, 20)
         *
         * Java compares:
         *
         *      10 vs 20
         *
         * 10 is smaller.
         */

        int minimum = Integer.min(10, 20);

        System.out.println(minimum);
        // Output: 10


        /*
         * Another example:
         */

        int x = 50;
        int y = 30;

        int smaller = Integer.min(x, y);

        System.out.println(smaller);
        // Output: 30



        // ============================================================
        //                   CHARACTER METHODS
        // ============================================================

        /*
         * Character is the Wrapper Class for primitive char.
         *
         * Primitive:
         *      char
         *
         * Wrapper:
         *      Character
         *
         * Character provides many useful methods for
         * String and DSA problems.
         */


        // ============================================================
        // 5. Character.isDigit()
        // ============================================================

        /*
         * isDigit() checks whether a character is a digit.
         *
         * Digits:
         *
         *      0 1 2 3 4 5 6 7 8 9
         *
         * Syntax:
         *
         *      Character.isDigit(character)
         *
         * It returns:
         *
         *      true  → character is a digit
         *      false → character is NOT a digit
         */

        char ch = '5';

        boolean result1 = Character.isDigit(ch);

        System.out.println(result1);
        // Output: true


        /*
         * Example with a letter:
         */

        boolean result2 = Character.isDigit('A');

        System.out.println(result2);
        // Output: false


        /*
         * Remember:
         *
         * Character.isDigit('5') → true
         * Character.isDigit('A') → false
         */


        // ============================================================
        // 6. Character.isLetter()
        // ============================================================

        /*
         * isLetter() checks whether a character is a letter.
         *
         * Letters include:
         *
         *      A B C ... Z
         *      a b c ... z
         *
         * Syntax:
         *
         *      Character.isLetter(character)
         *
         * Returns:
         *
         *      true  → character is a letter
         *      false → character is NOT a letter
         */

        char letter = 'A';

        boolean result3 = Character.isLetter(letter);

        System.out.println(result3);
        // Output: true


        /*
         * Check a number:
         */

        boolean result4 = Character.isLetter('5');

        System.out.println(result4);
        // Output: false


        /*
         * Remember:
         *
         * Character.isLetter('A') → true
         * Character.isLetter('z') → true
         * Character.isLetter('5') → false
         */


        // ============================================================
        // 7. Character.isLetterOrDigit()
        // ============================================================

        /*
         * isLetterOrDigit() checks whether a character is:
         *
         *      1. A letter
         *              OR
         *      2. A digit
         *
         * Syntax:
         *
         *      Character.isLetterOrDigit(character)
         *
         * Returns:
         *
         *      true  → letter OR digit
         *      false → neither
         */

        char ch1 = 'A';

        System.out.println(
                Character.isLetterOrDigit(ch1)
        );
        // Output: true
        // Because A is a letter


        char ch2 = '5';

        System.out.println(
                Character.isLetterOrDigit(ch2)
        );
        // Output: true
        // Because 5 is a digit


        char ch3 = '@';

        System.out.println(
                Character.isLetterOrDigit(ch3)
        );
        // Output: false
        // Because @ is neither a letter nor a digit


        /*
         * Very useful in DSA:
         *
         * if (Character.isLetterOrDigit(ch)) {
         *
         *     // process the character
         *
         * }
         *
         * This is commonly used when we want to ignore
         * special characters such as:
         *
         *      ! @ # $ % ^ & *
         */


        // ============================================================
        // 8. Character.toLowerCase()
        // ============================================================

        /*
         * toLowerCase() converts an uppercase character
         * into lowercase.
         *
         * Syntax:
         *
         *      Character.toLowerCase(character)
         *
         * Example:
         *
         *      'A' → 'a'
         *      'B' → 'b'
         *      'Z' → 'z'
         */

        char upper = 'A';

        char lower = Character.toLowerCase(upper);

        System.out.println(lower);
        // Output: a


        /*
         * Another example:
         */

        System.out.println(
                Character.toLowerCase('Z')
        );
        // Output: z


        /*
         * If the character is already lowercase,
         * it remains unchanged.
         */

        System.out.println(
                Character.toLowerCase('a')
        );
        // Output: a


        // ============================================================
        // 9. Character.toUpperCase()
        // ============================================================

        /*
         * toUpperCase() converts a lowercase character
         * into uppercase.
         *
         * Syntax:
         *
         *      Character.toUpperCase(character)
         *
         * Example:
         *
         *      'a' → 'A'
         *      'b' → 'B'
         *      'z' → 'Z'
         */

        char lowerCase = 'a';

        char upperCase = Character.toUpperCase(lowerCase);

        System.out.println(upperCase);
        // Output: A


        /*
         * Another example:
         */

        System.out.println(
                Character.toUpperCase('z')
        );
        // Output: Z


        /*
         * If the character is already uppercase,
         * it remains unchanged.
         */

        System.out.println(
                Character.toUpperCase('A')
        );
        // Output: A
    }
}