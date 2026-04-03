package Loops.forLoop;

import java.util.Scanner;

public class aRaisedToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int a = sc.nextInt();
        System.out.print("Enter the Power : ");
        int b = sc.nextInt();
        int pow = 1 ;
        System.out.println(Integer.MAX_VALUE);

        for(int i = 1 ; i<=b ; i++){
            pow *= a ;
        }
        System.out.println("The value of " + a + "^" + b + " is " + pow);
    }
}
