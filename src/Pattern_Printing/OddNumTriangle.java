package Pattern_Printing;

import java.util.Scanner;

public class OddNumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            int a = -1 ;
            for (int j = 1 ; j <= i ; j++){
                System.out.print((a+=2) + "  ");
            }
            System.out.println();
        }
        System.out.println("\n");


        // smarter way with maths
        System.out.println("Output with Smart Maths ->> ");

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print((2*j-1) + "  ");
            }
            System.out.println();
        }
    }
}
