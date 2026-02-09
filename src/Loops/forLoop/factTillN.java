package Loops.forLoop;

import java.util.Scanner;

public class factTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int fac = 1 ;

        for(int i=1 ; i<=n ; i++){
            fac *= i ;
            System.out.println("The value of factorial " + i  + " is " + fac);
        }
    }
}
