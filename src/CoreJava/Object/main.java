package CoreJava.Object;

public class main {
    static void main() {
        Car car = new Car();
//        car.isRunning = true; you can chnage the attributes like this
/*      car.model = "Punch";
        System.out.println(car); //gives you the memoryt address
        System.out.println(car.make); //DOT operator is use to access things or attributes withing object
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        */

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();
        car.stop();
        System.out.println(car.isRunning);

    }
}
