package Sorting_Algorithms;

import java.util.ArrayList;

public class _10_KthSmallestElement_selection {
    public static int kthSmallest(int[] arr, int k) {
        // Here we used the ArrayList, if the Array contains Duplicate elements.

        ArrayList<Integer> list = new ArrayList<>();
        // Time Complexity = 0(n*k)
        for(int i = 0 ; i < k ; i++){
            int min = Integer.MAX_VALUE, mindex = -1 ;
            for(int j = i ; j < arr.length ; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
            if(list.isEmpty() || list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }
        return list.getLast();
    }


    public static void main(String[] args) {
        int[] arr = {2,7,0,0,-3,6,1,1,4,9,17,0};
        int k = 7;
        System.out.println(kthSmallest(arr, k));
    }
}
