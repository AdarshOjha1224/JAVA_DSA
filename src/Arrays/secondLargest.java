package Arrays;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
//        SPECIALITY -> REPEATITION IS ALLOWED

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the value : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

//        int max = Integer.MIN_VALUE;
//        for(int i = 0 ; i<n ; i++){
//            if(arr[i]>max) max = arr[i];
//        }
//        System.out.println("Maximum : " + max);
//
//        int smax = Integer.MIN_VALUE;
//
//        for(int i = 0 ; i<n ; i++){
//            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
//        }
//        System.out.println("Second Maximum : " + smax);

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
        }
        System.out.println("Maximum : " + max);
        System.out.println("Second Maximum : " + smax);

    }
}
