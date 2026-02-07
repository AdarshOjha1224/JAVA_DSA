package If_else;

import java.util.Scanner;

public class TakeR_OutZorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        double n = sc.nextDouble();

        if (n == (int)n) System.out.println("Its Not a Integer !!");
        // or if (n-(int)n > 0) then the output for -ve value gonna wrong.

        else System.out.println("Its a Integer !!");
    }
}
