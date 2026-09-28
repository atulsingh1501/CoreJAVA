package OOPs.Constructors;

public class Students {
//A constructor is a special method in a class that is
// automatically called when an object is created. It is mainly used to initialize the object's data.

//    Important points for your notes
//Constructor name must be the same as the class name.
//It has no return type, not even void.
//It runs automatically when an object is created.
//It is used to initialize instance variables.
//A class can have multiple constructors (constructor overloading).

    String name = "SpiderMan";
    int age;
    double gpa;
    boolean isEnrolled;


    Students(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled =true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
