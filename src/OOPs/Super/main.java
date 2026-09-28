package OOPs.Super;

import java.sql.SQLOutput;

public class main {
    public static void main(String[]args) {
        Person P1 = new Person("Tom" , "Riddle");
        Person P2 = new Person("Harry" , "Potter");

//        System.out.println("Name of the Person 1 is: " + P1.First +" "+ P1.Second);
//        System.out.println("Name of the Person 2 is: " + P2.First +" "+ P2.Second);
        P1.showName();
        P2.showName();

        Student S1 = new Student("Atul", "Singh", 6.52);
        S1.displayGpa();

        Employee E1 = new Employee("Albus" , "Doumbledor" , 500000);
        E1.employeeData();

        System.out.println("the total number of person is : " + Person.numOfPerson);
    }
}
