package OOPs.Objects;

public class Car {
    String make = "Tata";
    String model = "nexon";
    int year = 2026;
    double price = 1100000.45;
    boolean isRunning = false;
    void start(){
        isRunning = true;
        System.out.println("you start the engine");
    }
    void drive() {      // Method
        System.out.println("You drive the " + model);
    }

    void brake() {      // Method
        System.out.println("you brake the " + model );
    }

    void stop(){
        isRunning = false;
        System.out.println("you stop the engine");
    }
}
