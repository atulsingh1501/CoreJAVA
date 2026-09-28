package OOPs.Encapsulation;

public class Car {
    private String color;
    private String model;
    private int price;
    Car(String color, String model, int price){
        this.color = color;
        this.model = model;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }
    String getColor() {
        return this.color;
    }
    String getPrice() {
        return  "$" + this.price;
    }///get method use to make a field readable

    void setColor(String color){
        this.color = color;
    }/// setter method use to make a field Writeable
    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can't be less than zero");
        }else{
            this.price = price;
        }
    }
}
