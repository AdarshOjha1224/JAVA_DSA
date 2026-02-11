package Arrays;

import java.util.Scanner;

public class printOnlyNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The negative values : ");
        for (int i = 0 ; i < n ; i++) if (arr[i]<0) System.out.print(arr[i] + " ");

    }
}
