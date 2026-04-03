package Pattern_Printing;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of rows : ");
        int n = sc.nextInt();

        for (int i = 1 ; i<= n ; i++) {
            for(int j = 1 ; j < n+1-i ; j++){
                System.out.print("   ");
            }
            for(int j = 1 ; j <= n ; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
