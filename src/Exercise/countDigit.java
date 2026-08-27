package Exercise;

public class countDigit {
    static int countDigit(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }

        while ( n != 0) {

            n = n / 10;
            count++;
        }

        return count;
    }

   public static void main(String[] args) {
       int num = 0;
       System.out.println(countDigit(num));
    }
}
