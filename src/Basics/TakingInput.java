package Basics;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.println("The area is " + a);

        System.out.print("Enter the value of radius: ");
        double R = sc.nextDouble();
        double V = 4.0/3 * 3.141592 * R * R * R;
        System.out.println("The volume is " + V);
    }
}
