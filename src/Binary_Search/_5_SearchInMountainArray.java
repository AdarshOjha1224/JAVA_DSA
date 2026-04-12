package Binary_Search;

public class _5_SearchInMountainArray {
    // arr is guaranteed to be a mountain array.

    public static int peakIndexInMountainArray(int[] arr) {
//        int low = 1 , high = arr.length - 2 ;
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
//            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid + 1 ;
//            else high = mid - 1 ;
//        }
//        return 0;

        // Very Smarter Way
        int low = 0 , high = arr.length - 1;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid+1]) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,5,6,8,6,3,-5};
        int n  = peakIndexInMountainArray(arr);
        System.out.println("Peak element is " + arr[n] + " at index " + n);
    }
}
