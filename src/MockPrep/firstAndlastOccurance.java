package MockPrep;

import java.util.Scanner;

public class firstAndlastOccurance {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ;i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sol(arr,target);
    }
    static void sol(int[]arr, int target){
        int f = -1;
        int l = -1;
       for(int i = 0; i<arr.length;i++){
           if(target == arr[i] ){
               if(f == -1){
                   f = i;
               }
               l = i;
           }
       }
        System.out.println( " first: " + f +" "+ "last: "+ l);
    }

}
