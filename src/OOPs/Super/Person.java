package OOPs.Super;

public class Person {
    static int numOfPerson;
    // super is a keyword used in inheritance to refer to the immediate parent class.
    // It is mainly used to access the parent's variables, methods, and constructor.

    String First;
    String Second;

    Person(String First, String Second ){
        this.First = First;
        this.Second = Second;
        numOfPerson++;
    }
    void showName(){
        System.out.println("Name of the Person is: " + this.First +" "+ this.Second);
    }


}


