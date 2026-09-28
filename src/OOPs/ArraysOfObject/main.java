package OOPs.ArraysOfObject;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang","Red");
        Car car2 = new Car("Ferrari","Yellow");
        Car car3 = new Car("BMW","Blue");

//An array of objects is an array that stores multiple objects of the same clas
        Car [] Cars = {car1, car2, car3};

        for(int i = 0; i<Cars.length; i++){
            Cars[i].color = "Black";
        }
//        for (Car car : Cars){
//            car.color = "red";
//        } both are the same

        for (Car car : Cars){
            car.Drive();
            car.stop();

        }
    }
}
