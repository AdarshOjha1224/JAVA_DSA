package Arrays;

import java.util.Arrays;

public class sortArrayBuiltIn {
    public static void print(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // sort - Ascending Order

        int[] arr = {2,4,-6,7,23,-5,3};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
}
