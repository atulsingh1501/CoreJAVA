package OOPs.AnonymusClass;

public class main {
    static void main() {
        Dog dog1 = new Dog();
        //An anonymous class is a class that does not have a
        // name and is created at the same time when we create its object.
        //Anonymus class for dog 2
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo does *Ruh Roh*");
            }
        };
        dog1.speak();
        dog2.speak();
    }
}
