package Loops.whileLoop;

import java.util.Scanner;

public class sumAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int a = n ;
        int sum = 0 ;
        int rev = 0 ;

        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        System.out.println("The sum of digits : " + ((sum>0) ? sum : -sum));

        while(n!=0){
            rev*=10;
            rev+=n%10;
            n/=10;
        }
        System.out.println("The reverse of number : " + rev);
    }
}
