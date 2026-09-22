package OOPs.Objects;

public class main {
    static void main() {
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
