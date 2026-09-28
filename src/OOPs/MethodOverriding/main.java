package OOPs.MethodOverriding;

public class main {
    static void main() {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        System.out.println("1 - This is about Dog");
        dog.Move();
        dog.Speak();

        System.out.println("2 - This is about Cat");
        cat.Move();
        cat.Speak();

        System.out.println("3 - his is about Fish");
        fish.Move();
        fish.Speak();
    }
}
