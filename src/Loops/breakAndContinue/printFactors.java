package Loops.breakAndContinue;

import java.util.Scanner;

public class printFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {                 // 1 se sqrt of n tkk ek bhi factor nikal
                System.out.println(i);
                if(i!=n/i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
