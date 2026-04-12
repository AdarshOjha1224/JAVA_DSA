package Sorting_Algorithms;

public class _11_StablityOfBubbleSelection {
    public static void main(String[] args) {
        int[] arr = {7,3,4,7,8,1};
        // arr = {7a,3,4,7b,8,1}
        _2_BubbleSort.print(arr);
        _2_BubbleSort.BubbleSort(arr);
        _2_BubbleSort.print(arr); // arr = {1,3,4,7a,7b,8} -> STABLE
        _5_SelectionSort.selectionSort(arr);
        _2_BubbleSort.print(arr); // arr = {1,3,4,7b,7a,8} -> UNSTABLE
    }
}
