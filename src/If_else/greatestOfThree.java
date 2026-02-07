package If_else;

import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int y = sc.nextInt();
        System.out.print("Enter 3nd number :");
        int z = sc.nextInt();

//        if (x > y && x > z) System.out.println(x + " is the greatest");
//        else {
//            if (y > x && y > z) System.out.println(y + " is the greatest");
//            else System.out.println(z + " is the greatest");
//        }

        // NESTED IF-ELSE

//        if (x>=y) {
//            if(x>=z) System.out.println(x + " is the greatest");
//            else System.out.println(z + " is the greatest");
//        }
//        else {
//            if(y>=z) System.out.println(y + " is the greatest");
//            else System.out.println(z + " is the greatest");
//        }

        // TERNARY OPERATOR
//        if (x>=y) {
//            System.out.println((x>=z) ? "1st number is greatest" : "3rd number is greatest");
//        }
//        else {
//            System.out.println((y>=z) ? "2nd number is greatest" : "3rd number is greatest");
//        }

//        for evenOdd-
//        (n%2==0) ? sout("Even") : sout("Odd"); // only possible in C and C++.

        // NESTED TERNARY OPERATOR

        int a = (x>y) ? ((x>z) ? x : z) : ((y>z) ? y : z) ;
        System.out.println("The Greatest Number is : " + a);
    }
}
