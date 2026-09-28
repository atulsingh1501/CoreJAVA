package OOPs.Objects;

public class main {
    static void main() {
//        Here:
//
//        Car → class
//        car1 → object
//        new Car() → creates the object
//        Object: An instance of a class that represents a real entity and has its own data and behavior.

        Car car1 = new Car();

//        car.isRunning = true; you can chnage the attributes like this

        car1.model = "Punch";

       /* System.out.println(car); //gives you the memoryt address
        System.out.println(car.make); //DOT operator is use to access things or attributes withing object
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        */

        System.out.println(car1.isRunning);
        car1.start();
        System.out.println(car1.isRunning);
        car1.drive();
        car1.brake();
        car1.stop();
        System.out.println(car1.isRunning);

    }
}
