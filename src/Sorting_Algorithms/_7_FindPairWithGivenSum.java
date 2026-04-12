package Sorting_Algorithms;
import java.util.Arrays;

// Sorted array is given , finding pairs of number which is equal to target.

public class _7_FindPairWithGivenSum {
    public static void pair(int[] arr , int target){
        int n  = arr.length;
        int i =  0;
        int j = n-1;
        while(i<j) {
            if (arr[i] + arr[j] == target) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
                i++;
                j--;
            }
            else if (arr[i] + arr[j] > target) j--;
            else if (arr[i] + arr[j] < target) i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,45,12,6,5,10,11,8};
        int target = 16;
        Arrays.sort(arr);
        pair(arr,target);
    }
}
