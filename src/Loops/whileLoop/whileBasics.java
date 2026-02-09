package Loops.whileLoop;

import java.util.Scanner;

public class whileBasics {
    public static void main(String[] args) {
        // while - Generally used when conditions are more than one

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int i = 1 ;
        while (i<=n){
            System.out.println(i + " ");
            i++;
        }
    }
}
