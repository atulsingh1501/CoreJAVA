public class o1_Main {
    public static void main(String[]args){
        System.out.println("I like pizza!");
        //variables

        int age = 30; //int is a data type where int age is a varibale with store a intger valu 30 which is a age of person,place or anythings
        int year = 2025;
        int quantity = 1;
        System.out.println(quantity);
        System.out.println("this is year " + year + ".");

        double price = 10.99;
        double gpa = 3.5;
        double temperature = -12.5;
        System.out.println("$" + price );

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(symbol);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("you are NOT a student!");
        }

// Strings
        String name = "Atulya Singh";
        String email = "atul@gmail.com";

        String car = "ferrari";
        String color ="red";
        System.out.println("hello " + name);
        System.out.println("my email is " + email);
        System.out.println("my gpa is: " + gpa);
        System.out.println("my choice is a " + color+ " " + car +" "+ year);
        if(forSale){
            System.out.println("there is a " + car + "for sale");

        }
        else{
            System.out.println("the " + car + " is not for sale");
        }
    }
}
