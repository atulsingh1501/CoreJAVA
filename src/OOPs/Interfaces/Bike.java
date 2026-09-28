package OOPs.Interfaces;

public class Bike implements Electric , nonElectric{

    @Override
    public void Charger(){
        System.out.println("bike is electric");
    }

    @Override
    public void NoCharger(){
        System.out.println("Also bike is non electric");
    }
}
