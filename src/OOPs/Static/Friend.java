package OOPs.Static;

import java.sql.SQLOutput;

public class Friend {

    //Static = Static makes a method that only belongs to a Class
    //it does'nt belong to a particular object.
    //A static variable in Java is a class-level variable declared with the static keyword.
    // It belongs to the class itself rather than any specific instance (object) of that class.
    static int numOfFrineds;
    String name;

    Friend(String name){
        this.name = name;
        numOfFrineds++;
    }
    static void showFriend(){
        System.out.println("you have " + numOfFrineds + " firends");
    }

    public static void main(String [] args) {
        Friend Friend1 = new Friend("Atul");
        Friend Friend2 = new Friend("Abhay");
        Friend Friend3 = new Friend("Pranav");


        System.out.println(Friend.numOfFrineds);
        Friend.showFriend(); // this call the static method from the class
        showFriend();
    }

}
