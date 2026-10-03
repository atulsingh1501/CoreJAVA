package OOPs.Aggregation;

public class Main {
    static void main() {
        // Aggregation is a type of relationship between two classes
        //where one class HAS-A another class, but both can exist independently.
        Movies m1 = new Movies("Dead Poet Socity",8.1);
        Movies m2 = new Movies("Good Will Hunting" ,8.4);
        Movies m3 = new Movies("A Beautiful Mind" , 8.2);

        Movies[] movie = {m1,m2,m3};

        Hollywood H = new Hollywood("The Walking Dead","Spider-Man: Into the Spider-Verse",movie);
        H.Displayinfo();
    }
}
