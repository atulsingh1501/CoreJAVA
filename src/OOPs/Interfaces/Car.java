package OOPs.Interfaces;

public class Car implements Electric,nonElectric{
    @Override
    public void Charger(){
        System.out.println("Car is electric");
    }
    @Override
    public void NoCharger(){
        System.out.println("Car is nonelectric");

    }
}
