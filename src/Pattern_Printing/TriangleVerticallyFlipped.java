package Pattern_Printing;

import java.util.Scanner;

public class TriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n; j++){
                if(j<n+1-i){
                    System.out.print("  ");
                }
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n; j++){
                if((i+j)>n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        // MORE DIFFERENT WAYYY

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j < n+1-i; j++){
                System.out.print("  ");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
