package Sorting_Algorithms;

public class _4_MoveAllZerosToend {
    // Move all the zeros in the end and the order of non-zero element remain same.
    public static void SeparateZero(int[] arr) {
        int n = arr.length;
//        for(int i = 0 ; i < n-1 ; i++){
//            for(int j = 0 ; j < n-1 ; j++){
//                if(arr[j]==0){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }


        // Uses the concept of Sliding Window
        // faster then above method
        int j =  0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-3,0,1,2,0,0,5,7,0,8,9};
        _2_BubbleSort.print(arr);
        SeparateZero(arr);
        _2_BubbleSort.print(arr);
    }
}
