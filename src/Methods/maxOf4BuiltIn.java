package Methods;

import java.util.Scanner;

public class maxOf4BuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int a = sc.nextInt();
        System.out.print("Enter the second value : ");
        int b = sc.nextInt();
        System.out.print("Enter the third value : ");
        int c = sc.nextInt();
        System.out.print("Enter the fourth value : ");
        int d = sc.nextInt();

        System.out.println("Greatest : " + Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
