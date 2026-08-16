package CoreJava;

public class o15_BreakandContinue {
    static void main() {
//        break → Stop the loop completely
//        When Java sees break, it comes out of the loop immediately.
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.println(i );
        }
//        continue → Skip only the current iteration
//When Java sees continue, it skips the remaining code of the current iteration and goes to the next iteration.
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
