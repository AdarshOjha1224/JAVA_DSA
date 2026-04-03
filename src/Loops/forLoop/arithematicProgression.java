package Loops.forLoop;

import java.util.Scanner;

public class arithematicProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term : ");
        int a = sc.nextInt();
        System.out.print("Enter the Common difference : ");
        int d = sc.nextInt();
        System.out.print("Enter the Total number of terms : ");
        int n = sc.nextInt();

//        for(int i = a ; i <= (a+(n-1)*d) ; i += d) {
//            System.out.print(i + " ");
//        }

        // Find-Out Smarter way ->>>>
        for(int i = 1 ; i <= n ; i++){
            System.out.print((a+(i-1)*d) + " ");
        }
    }
}
