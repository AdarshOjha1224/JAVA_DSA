package Methods;

import java.util.Scanner;

public class maxOf3BuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int x = sc.nextInt();
        System.out.print("Enter the second value : ");
        int y = sc.nextInt();
        System.out.print("Enter the third value : ");
        int z = sc.nextInt();

        System.out.println("Greatest : " + Math.max(Math.max(x,y),z));
    }
}
