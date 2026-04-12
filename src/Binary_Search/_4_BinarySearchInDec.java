package Binary_Search;

public class _4_BinarySearchInDec {
    public static int revBinarySearch(int[] arr,int target){
        int low = 0,high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 7;
        System.out.println(revBinarySearch(arr,target));
    }
}
