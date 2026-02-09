package Pattern_Printing;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the value of Column : ");
        int col = sc.nextInt();

        for (int i = 1 ; i <= row ; i++){
            for (int j = 1 ; j <= col ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
