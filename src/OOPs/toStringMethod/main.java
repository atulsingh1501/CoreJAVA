package OOPs.toStringMethod;

public class main {
    public static void main(String[] args){
        Car car1 = new Car("Tata","Nexon",2026,"Pure Grey");
        Car car2 = new Car("Mahindra","Thar",2026,"Black");

        // if i have to print this
//        System.out.println(car1); // by directly doing this i get a default hash code as unique identifiers {OOPs.toStringMethod.Car@8efb846} look like this.
// Without overriding toString(), printing an object uses
// Object's default toString() implementation, which gives
// a class name and a hash-code-derived value.
        // for printing car 1 data i have to do this and it take to much time to wite for every single object thats why we use .toString();
        System.out.println(car1.Make + "," + car1.Model +"," + car1.Year +"," + car1.Color);

        // by toString method we can directly print the car data it convert an object as a string
        System.out.println(car1);
        System.out.println(car2);
        // By overriding toString(), we can define how an object
       // should be represented as a String.
    }
}
