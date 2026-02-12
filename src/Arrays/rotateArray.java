package Arrays;

public class rotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int r = 2;

        for(int i = 0 ; i < r ; i++){
            int temp = arr[n-1];

            for(int j = n-1 ; j > 0 ; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }

        for (int ele : arr) System.out.print(ele + " ");
    }
}
