package Sorting_Algorithms;

public class _3_Reverse_BubbleSort {
    public static void BubbleSortReverse(int[] arr) {
        int n = arr.length;

        // Better Version - (Optimized)
        for(int i = 0; i < n - 1; i++) {
            int swaps = 0 ;
            for(int j = n -1 ; j > i; j--) {
                if(arr[j] > arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, -1, 4, 9, -2, 0, 3, 2, 8};
        _2_BubbleSort.print(arr);
        BubbleSortReverse(arr);
        _2_BubbleSort.print(arr);
    }
}
