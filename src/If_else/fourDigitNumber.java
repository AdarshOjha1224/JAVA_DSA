package If_else;

import java.util.Scanner;

public class fourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n>999 && n<10000) System.out.println("Its 4 digit number !!");
        else System.out.println("Its Not !!");
    }
}
