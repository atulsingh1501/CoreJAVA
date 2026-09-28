package OOPs.Interfaces;

public class main {
    static void main() {
        Bike b1 = new Bike();
        Car c1 = new Car();
        Plane p1 = new Plane();
        Cycle y1 = new Cycle();

        b1.Charger();
        b1.NoCharger();

        c1.NoCharger();;
        c1.Charger();

        p1.NoCharger();

        y1.NoCharger();
    }
}
