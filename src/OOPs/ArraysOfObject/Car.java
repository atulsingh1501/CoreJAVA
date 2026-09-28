package OOPs.ArraysOfObject;

import java.sql.SQLOutput;

public class Car {
    String name;
    String color;

    Car(String name, String color){
        this.name = name;
        this.color = color;
    }
     public void Drive(){
        System.out.println( "you are driving"+ " " + this.color + " " + this.name);
    }

    void stop(){
        System.out.println("you stop the" + " " + this.color + " " + this.name);
    }
}
