package Sorting_Algorithms;

public class _12_InsertionSorting {
    // More Similar to Bubble Sort.
    // Adjacent Elements Swapping.
    // There are two parts - sorted part & Unsorted part.
    // Put the first element of Unsorted part in the sorted part at right place.
    // STABLE SORTING

    public static int[] InsertionSort(int[] arr) {
        int n =  arr.length;
        for (int i = 1; i < n; i++) {
            int j = i ;
            while (j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,7,17,10,-3,99,-1,3,9,1,0,8};
        InsertionSort(arr);
        _2_BubbleSort.print(arr);
    }
}
