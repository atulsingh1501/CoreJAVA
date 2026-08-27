package Exercise;

import java.util.Scanner;

public class Ex_7methodsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageno = sc.nextInt();

        if(isVote(ageno)){
            System.out.println("ha ha ha");
        }else{
            System.out.println("na na na");
        }
    }
    static boolean  isVote(int age){
        if(age>18){
            return true;
        }else{
            return false;
        }
    }
}


