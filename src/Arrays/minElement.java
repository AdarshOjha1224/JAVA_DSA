package Arrays;

import java.util.Scanner;

public class minElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the count of number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        // OR  int min = Integer.MAX_VALUES;

        for(int i = 0 ; i<n ; i++){
            if(arr[i] < min) min = arr[i];
        }

        System.out.println("Maximum : " + min);
    }
}
