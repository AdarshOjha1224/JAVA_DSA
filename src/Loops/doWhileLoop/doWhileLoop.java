package Loops.doWhileLoop;
import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int i = 1 ;
        // Do-while -> Definitely gonna run once then check the condition.
        do {
            System.out.println(i + " ");
            i++;
        }while (i<=n);
    }
}