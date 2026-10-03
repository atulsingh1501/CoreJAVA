package OOPs.Compositon;

public class main {
    static void main() {
        Car car = new Car("Corvette",2025,"V8");
        System.out.println(car.Model);
        System.out.println(car.Year);
        System.out.println(car.engine.type);

        car.start();

    }

}
