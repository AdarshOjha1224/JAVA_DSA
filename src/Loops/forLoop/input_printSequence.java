package Loops.forLoop;

import java.util.Scanner;

public class input_printSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int m = n ;
        int o = 1 ;

        for(int i = 1 ; i <= n ; i++){
            if(i%2==0) System.out.println(m--);
            else System.out.println(o++);
        }
    }
}
