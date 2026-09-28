package OOPs.Abstraction;

public class main {
    static void main() {
        Triangle t1 = new Triangle(22,5);
        Circle c1 = new Circle(13.2);
        Rectangle r1 = new Rectangle(10,12);

        c1.display();
        System.out.println(c1.area());
        System.out.println(t1.area());
        System.out.println(r1.area());

    }
}
