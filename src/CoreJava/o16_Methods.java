package CoreJava;

public class o16_Methods {
   public static void main(String[] args) {
       greet();
       int a = 24;
       int b = 16;
       System.out.println(add(a , b));

       int age = 24;
       if(Age(age)){
           System.out.println("you are baccha");
       }else{
           System.out.println("you are badda");
       }
    }
    static void greet(){
        System.out.println("hello");
    }
    static int add(int a , int b){
       return a + b;

    }
    static boolean Age(double age){
       if(age<18){
           return true;
       }else {
           return false;
       }
    }
}
