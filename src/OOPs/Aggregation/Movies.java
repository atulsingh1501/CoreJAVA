package OOPs.Aggregation;

public class Movies {
    String Name;
    double Rating;

    Movies(String Name, double Rating){
        this.Name = Name;
        this.Rating = Rating;

    }
    void display(){
        System.out.println( "The Movie"+" " + this.Name + " " + "has"+" "+ this.Rating +" "+"Rating on IMDB");
    }
}
