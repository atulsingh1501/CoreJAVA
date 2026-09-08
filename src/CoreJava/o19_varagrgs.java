package CoreJava;

public class o19_varagrgs {
    static void main() {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20, 30, 40, 50));

    }
        static int add(int... numbers) {
            int sum = 0;

//            for(int i = 0; i <= numbers.length ; i++){
//                sum += numbers[i];
//            }
            for (int num : numbers) {
                sum += num;
            }

            return sum;
        }
}
