package Arrays;

// HW -> {3,5,2,0,7} + {9,2,1} = {3,6,1,2,8}

import java.util.Arrays;

public class addTwoArray {
    public static int convertArrayToNumber(int[] arr){
        int n = arr.length;
        int sum = 0 ;
        for(int i = 0; i < n; i++){
            sum *= 10;
            sum += arr[i];
        }
        return sum;
    }

    public static int[] convertNumberToArray(int n){
        int a = 0 , b = n;
        while (b > 0){
            b/=10;
            a++;
        }
        int[] arr = new int[a];
        for(int i = 0 ; i < a ; i++){
            arr[a-1-i] = n%10;
            n/=10;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {3,5,2,0,7};
        int[] arr2 = {9,2,1};
        int finalSum = convertArrayToNumber(arr1) +  convertArrayToNumber(arr2);
        System.out.println(finalSum);
        int[] finalArray = convertNumberToArray(finalSum);
        System.out.println(Arrays.toString(finalArray));

    }
}
