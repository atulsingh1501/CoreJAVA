import java.util.Random;
public class o5_randomNumber {
    static void main() {
        Random random = new Random();

        boolean isHeads;
        isHeads = random.nextBoolean();

        double number;
        number = random.nextDouble();
//        int number1;
//        int number2;
//        int number3;
//
//
//        number1 = random.nextInt(1,101);
//        number2 = random.nextInt(1,101);
//        number3 = random.nextInt(1,101);
//
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);

        System.out.println(number);
        if(isHeads){
            System.out.println("Head");
        }else{
            System.out.println("tail");
        }

    }

}
