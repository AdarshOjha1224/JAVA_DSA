package Pattern_Printing;

import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();

        // other methods which is present in the TriangleVerticallyFlipped is not gonna work here !!
        // that's why we learn this method to break the pattern into different triangle tasks

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j < n+1-i; j++){
                System.out.print("  ");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print((char)(64+i) + " ");
            }
            System.out.println();
        }
    }
}
