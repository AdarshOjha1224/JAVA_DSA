package If_else;

import java.util.Scanner;

public class magnitudeSmallerThan69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value :");
        int n = sc.nextInt();

        if(n<0) n = -n;

        if(n<69) System.out.println("Magnitude is Smaller than 69");
        else if (n>69) System.out.println("Magnitude is Greater than 69");
        else System.out.println("Magnitude is Equal to the 69");
    }
}
