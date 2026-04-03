package Pattern_Printing;

import java.util.Scanner;

public class StarFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n+1-i ; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n+1-i ; j++){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n+1-i ; j++){
                System.out.print((char)(64+j) + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n+1-i ; j++){
                System.out.print((char)(96+j) + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
