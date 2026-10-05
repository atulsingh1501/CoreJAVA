package Exercise;

import java.util.Arrays;

public class ReverseArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
           int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        System.out.println("reverse Array is: " + Arrays.toString(arr));
    }
}
