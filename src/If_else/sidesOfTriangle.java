package If_else;

import java.util.Scanner;

public class sidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st side :");
        int a = sc.nextInt();
        System.out.print("Enter the 2st side :");
        int b = sc.nextInt();
        System.out.print("Enter the 3st side :");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && a+c>b) System.out.println("Sides of Triangle");
        else System.out.println("Not the sides of Triangle");

    }
}
