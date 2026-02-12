package Loops.breakAndContinue;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean flag = true ; // true means PRIME
        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if(n%i == 0){ // 1 se sqrt of n tkk ek bhi factor nikal
                flag = false ; // false means COMPOSITE
                break;
            }
        }
        if(n==1) System.out.println("Neither prime nor composite ");
        else if (flag==false) System.out.println("Composite Number !!");
        else System.out.println("Prime Number !!");
    }
}