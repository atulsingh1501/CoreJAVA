package OOPs.Encapsulation;

public class main {
    public static void main(String[]args) {
        Car car = new Car("Red","Ferrari",1000000);

        car.setColor("Yellow");
        car.setPrice(-100);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
