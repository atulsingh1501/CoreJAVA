package Exercise;
import java.util.Scanner;

public class maximumElements {
//    Input:  [10, 5, 20, 8, 15]
//    Output: 20
    static void min(int[]nums){
        int max = nums[0];
        for (int i = 0 ;i < nums.length;i++){
                if(nums[i]>max){
                    max = nums[i];
                }
            }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        min(arr);


    }
}