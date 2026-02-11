package Arrays;

import java.util.Scanner;

public class productOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the count of number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int prd = 1;
        for (int i = 0 ; i < n ; i++){
            prd *= arr[i];
        }
        System.out.print("The product of the element : " + prd);
    }
}
