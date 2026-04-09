package Sorting_Algorithms;

public class _1_CheckSorted {
    public static boolean isSorted(int[] arr) {
        for(int i = 0 ; i < arr.length -1 ; i++){
            if(arr[i]>arr[i+1]) return false ;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(isSorted(arr1));
        int[] arr2 = {2,1,6,3,6,7,8,9};
        System.out.println(isSorted(arr2));
    }
}
