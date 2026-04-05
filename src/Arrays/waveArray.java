package Arrays;

//PROBLEM NAME : WAVE ARRAY (Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. If there are multiple solutions, find the lexicographically smallest one.)

public class waveArray {
    public static void sortInWave(int[] arr) {
        for(int i = 0 ; i < arr.length-1 ; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Original Array : ");
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
        sortInWave(arr);
        System.out.print("Wave Array : ");
        for(int ele : arr) System.out.print(ele + " ");
    }
}
