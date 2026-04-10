package Sorting_Algorithms;

public class _2_BubbleSort {
    public static void BubbleSort(int[] arr) {
        int n = arr.length;

        // Better Version - (Optimized)
        for (int i = 0; i < n-1; i++) {

            int swaps = 0 ;
            for(int j = 0; j < n-1-i ; j++){
                if(arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;

//            boolean isSorted = true;
//            for(int j = 0; j < n-1-i ; j++){
//                if(arr[j] > arr[j +1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j +1];
//                    arr[j +1] = temp;
//                    isSorted = false;
//                }
//            }
//            if(isSorted) break;
        }
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,-1,4,9,-2,0,3,2,8};
        print(arr);
        BubbleSort(arr);
        print(arr);
    }
}