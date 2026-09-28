package OOPs.MethodOverriding;

public class Fish extends Animal{

    @Override
    void Move() {
        System.out.println("Fish is swiming");
    }

    void Speak(){
        System.out.println("fish doesn't Speak");
    }
}
