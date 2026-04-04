package Arrays;

public class missingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        long n = arr.length + 1 ; // 1 to n tak number honge array me
        long sum = n*(n+1)/2;
        long arraySum = 0 ;
        for(int ele : arr) arraySum += ele;
        System.out.println("The missing element : " + (int)(sum-arraySum));
    }
}
