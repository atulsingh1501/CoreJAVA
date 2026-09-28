package OOPs.Super;

public class Employee extends Person {
    int salary;
    Employee( String First, String Second , int salary){
        super(First , Second);
        this.salary = salary;

    }
    void employeeData(){
        System.out.println("Name of Employee is " + this.First + " " + this.Second + " " +"with Salary: " + this.salary + "Euro");
    }
}
