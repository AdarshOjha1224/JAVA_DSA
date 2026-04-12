package Binary_Search;

import java.util.ArrayList;

public class _3_FirstAndLastOccurence {
    public static ArrayList<Integer> findFirstAndLastOcc(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        int low = 0 ,  high = arr.length-1 , first = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid]<target) low = mid+1;
            else high = mid-1;
        }
        list.add(first);
        low = 0 ;
        high = arr.length-1 ;
        int last = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid]<target) low = mid+1;
            else high = mid-1;
        }
        list.add(last);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println(findFirstAndLastOcc(arr,5));
    }
}
