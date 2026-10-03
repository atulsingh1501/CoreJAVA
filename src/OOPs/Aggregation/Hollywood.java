package OOPs.Aggregation;

public class Hollywood {
    String Series;
    String Animation;
    Movies[] movie;//aggregation

    Hollywood(String Series, String Animation, Movies[] movie){
        this.Series = Series;
        this.Animation = Animation;
        this.movie = movie;
    }
    void Displayinfo(){
        System.out.println("This is the best Series " + this.Series);
        System.out.println("the best animated movie " + this.Animation);
        for(Movies m : movie){
            m.display();
        }
    }
}
