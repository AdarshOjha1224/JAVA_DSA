package Binary_Search;

public class _1_BinarySearch {
    // Generally work on Sorted Array (Smarter).
    // To improve Time complexity
    // n -> logn   ,   n^2 -> nlogn


//    QUESTION - Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.


    public static int Binary_Search(int[] arr, int target){
        int low = 0 , high = arr.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-2,-1,0,3,5,7,11,19,21,34,56,78};
        int target = 34;
        System.out.println(Binary_Search(arr,target));
    }
}
