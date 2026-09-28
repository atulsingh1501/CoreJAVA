package OOPs.Abstraction;

public class Triangle  extends Shape{
    double length;
    double base;
     Triangle(double length,double base){
         this.length = length;
         this.base = base;
     }
    @Override
    double area(){
        return 0.5 * base * length;

    }
}
