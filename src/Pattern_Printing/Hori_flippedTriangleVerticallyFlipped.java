package Pattern_Printing;

import java.util.Scanner;

public class Hori_flippedTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j < i ; j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j < n+1-i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
