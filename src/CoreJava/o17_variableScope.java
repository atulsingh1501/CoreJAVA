package CoreJava;

public class o17_variableScope {

    static int x = 2; //class scope

    static void number(){
        int x = 0;  // local varibale

        System.out.println();
    }

    public static void main(String[] args) {
        int x = 1; // local varibale

        number();

        System.out.println(x);

    }
}
