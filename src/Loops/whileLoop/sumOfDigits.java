package Loops.whileLoop;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0 ;

        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("The sum of digits : " + ((sum>0) ? sum : -sum));
    }
}
