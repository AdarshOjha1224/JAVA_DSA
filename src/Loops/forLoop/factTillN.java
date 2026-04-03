package Loops.forLoop;

import java.util.Scanner;

public class factTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int fac = 1 , count = 1;

        for(int i=0 ; i<=n ; i++){
            System.out.println(i  + "! = " + fac);
            fac *= count;
            count++;
        }
    }
}