package Loops.forLoop;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term : ");
        int a = sc.nextInt();
        System.out.print("Enter the Common ratio : ");
        int r = sc.nextInt();
        System.out.print("Enter the Total number of terms : ");
        int n = sc.nextInt();

        for(int i = 1 ; i<= n ; i++){
            System.out.print(a + " ");
            a *= r ;
        }
    }
}
