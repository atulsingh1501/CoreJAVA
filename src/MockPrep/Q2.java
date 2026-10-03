package MockPrep;

import java.util.Scanner;

public class Q2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            System.out.println("enter height: ");
            arr[i] = sc.nextInt();
        }
        long answer = sol(arr);
        System.out.println(answer);

    }

    static long sol(int[] nums){
// arr{1,2,4,5,3}
        int l = 0;
        int r = nums.length -1;
        long maxArea = 0;

        while(l<r){
            int height = Math.min(nums[l],nums[r]);
            int width = r - l;
            int area = width * height;
            maxArea = Math.max(maxArea,area);
            if(nums[l]<nums[r]){
                l++;

            }else{
                r--;
            }
        }
        return maxArea;
    }
}
