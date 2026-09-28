package OOPs.toStringMethod;

public class Car {
    String Make;
    String Model;
    int Year;
    String Color;

    Car(String Make, String Model, int Year, String Color){
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this. Color = Color;
    }
    //toString() is a method of the Object class that returns a String representation of an object.
    @Override
    public String toString(){
        return this.Make + "," + this.Model +"," + this.Year +"," + this.Color;
    }

}
