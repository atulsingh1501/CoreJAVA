package OOPs.Inheritance;

import java.sql.SQLOutput;

public class Organism { // grandparents class
    boolean isAlive;


    Organism(){
        isAlive = true;
    }
    String species(){
        return "living things on Planet Earth";
    }
    public static void main(String[] args) {
        Organism organism = new Organism();
        System.out.println("is Organisam is alive? : " + organism.isAlive);
        System.out.println("what is Organisams? : " +   organism.species());

        System.out.println();

        Animal animal = new Animal();
        System.out.println("Is animal are Dangerous ? : " + animal.isDangerous);

        Dog dog = new Dog();
        System.out.println("is Dog is alive ? : " + dog.isAlive);
        dog.speak();

        Cat cat = new Cat();
        System.out.println("is cat is alive ? : " + cat.isAlive);
        cat.speak();

        System.out.println();

        Plant Plant = new Plant();
        Plant.photosynthesize();

        mangoTree mango = new mangoTree();
        System.out.println("is mango is tree ? : " + mango.isTree);
        mango.fruit();

        neemTree neem = new neemTree();
        System.out.println("is neem a tree ? : " + neem.isTree);
        neem.medicine();

    }
}
class Plant extends Organism{ // parent class and child of a grand parents
    boolean isTree;
    Plant(){
        isTree = true;
    }
    void photosynthesize(){
        System.out.println("The plants does photosynthesize");
    }
}
class mangoTree extends Plant{ // child class
    void fruit(){
        System.out.println("Mango is a king of fruits");
    }
}
class neemTree extends Plant{ //child class
    void medicine(){
        System.out.println("neem use to make a medicine");
    }
}

class Animal extends Organism{ //parents class
    Boolean isAlive;
    Boolean isDangerous;

    Animal(){
        isAlive = true;
        isDangerous = true;
    }
    void tail(){
        System.out.println("maximum animal have tail");
    }

}
class Dog extends Animal{ //child class
    void speak(){
        System.out.println("Dog does woofff");
    }
}
class Cat extends Animal{ //child class
    void speak(){
        System.out.println("Cat does Meow");
    }
}

