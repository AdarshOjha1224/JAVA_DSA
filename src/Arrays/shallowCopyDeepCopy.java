package Arrays;

import java.util.Arrays;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {

        // Shallow copy - change in copied array will also change the original
        // Deep copy - Any change in copies array will not affect the original

        int[] arr = {1,2,3,4,5}; // 4 x 5 = 20 bytes
        int[] x = arr;  // x is Shallow copy of arr
        x[0] = 100 ;
        System.out.println(arr[0]); // 100

        int[] y = Arrays.copyOf(arr,arr.length); // Deep copy
        y[0] = 20;
        System.out.println(arr[0]); // 100
        System.out.println(y[0]); // 20

        // more simple method of creating deep copy
        int[] brr = new int[arr.length]; // created a new array at different address
        for(int i = 0 ; i < arr.length ; i++){
            brr[i] = arr[i];
        }
        // brr is deep copy

    }
}
