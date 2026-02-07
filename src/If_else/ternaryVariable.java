package If_else;
import java.util.Scanner;
public class ternaryVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int a = (n>=0) ? 100 : 0 ;
        System.out.println((n%2==0) ? "Even" : "Odd");
        System.out.println(a);


//        To find greatest number in three inputs
//        int a = (x>y) ? ((x>z) ? x : z) : ((y>z) ? y : z) ;
//        System.out.println("The Greatest Number is : " + a);

    }
}