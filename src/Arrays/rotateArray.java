package Arrays;

public class rotateArray {

    public static void reverse(int[] arr , int i , int j){

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // LEFT SHIFTING

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int r = 3;
        r%=n;

        reverse(arr,0,r-1);
        reverse(arr,r,n-1);
        reverse(arr,0,n-1);

        for (int ele : arr) System.out.print(ele + " ");
    }
}
