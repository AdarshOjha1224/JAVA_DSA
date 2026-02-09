package Pattern_Printing;

import java.util.Scanner;

public class AlphaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print((char)(j+64) + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print((char)(i+64) + "  ");
            }
            System.out.println();
        }
    }
}
