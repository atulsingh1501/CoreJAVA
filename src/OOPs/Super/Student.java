package OOPs.Super;

import java.sql.SQLOutput;

public class Student extends Person {
    double gpa;

    Student( String First , String Second , double gpa) {
        super(First, Second);
        this.gpa = gpa;

    }


    void displayGpa(){
        super.showName();
        System.out.println( "And the GPA is : " + this.gpa);
    }
}
