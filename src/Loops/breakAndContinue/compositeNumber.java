package Loops.breakAndContinue;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i = 2 ; i < n ; i++) {
            if (n % i == 0) {
                System.out.println("COMPOSITE NUMBER !!");
                break;
            }
            else {
                System.out.println("NOT COMPOSITE !!");
                break;
            }
        }
    }
}
