package Binary_Search;

public class _2_FirstOccurence {
    public static int firstOccurence(int[] arr, int target){
        int low = 0 , high = arr.length - 1 , idx = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > target) high = mid - 1;
            else if(arr[mid] < target) low = mid + 1;
            else{
                idx = mid;
                high = mid - 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6,7,8,9,10};
        int target = 6;
        System.out.println(firstOccurence(arr,target));
    }
}
