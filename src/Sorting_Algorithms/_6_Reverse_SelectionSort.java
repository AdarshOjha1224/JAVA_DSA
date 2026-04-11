package Sorting_Algorithms;

public class _6_Reverse_SelectionSort {

    public static void reverseSelection(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int max = Integer.MIN_VALUE;
            int maxindex = -1;
            for(int j = i; j < n; j++){
                if(arr[j] > max){
                    max = arr[j];
                    maxindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,-2,5,10,7,-1,3,8,1,4,2};
        _2_BubbleSort.print(arr);
        reverseSelection(arr);
        _2_BubbleSort.print(arr);
    }
}
