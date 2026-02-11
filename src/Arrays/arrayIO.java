package Arrays;

import java.util.Scanner;

public class arrayIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The Given values : ");
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
