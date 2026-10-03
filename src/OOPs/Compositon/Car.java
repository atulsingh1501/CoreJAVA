package OOPs.Compositon;

public class Car {
    String Model;
    int Year;
    Engine engine;

    Car(String Model, int Year, String engineType){
        this.Model = Model;
        this.Year = Year;
        this.engine = new Engine(engineType);
    }
    void start(){
        this.engine.start();
        System.out.println("the "+ this.Model + " is running");
    }

}
