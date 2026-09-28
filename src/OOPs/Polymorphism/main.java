package OOPs.Polymorphism;

public class main {
    static void main() {
        Vehicle c1 = new Car();
        Vehicle b1 = new Bike();
        Vehicle a1 = new Boat();

        Vehicle[] v1 = {c1,b1,a1};
        for(int i = 0; i < v1.length; i++){
            v1[i].go();
        }
        for(Vehicle vehicles : v1){
            vehicles.go();
        }
    }
}
