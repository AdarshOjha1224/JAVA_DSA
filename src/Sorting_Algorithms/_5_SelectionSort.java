package Sorting_Algorithms;

public class _5_SelectionSort {

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int min = Integer.MAX_VALUE ;
            int mindx = -1;
            for(int j = i; j < n; j++){
                if(arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx] ;
            arr[mindx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,-2,5,10,7,-1,3,8,1,4,2};
        _2_BubbleSort.print(arr);
        selectionSort(arr);
        _2_BubbleSort.print(arr);
    }
}
