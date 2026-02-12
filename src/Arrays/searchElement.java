// Linear Search

package Arrays;
import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = {2,5,8,-34,76,18,-45,-3,23,83,94};

        System.out.print("Enter the value to search : ");
        int a = sc.nextInt();

        boolean flag = false ;
        for (int i = 0 ; i < x.length ; i++) {
            if (x[i] == a) {
                System.out.println("At index : " + i);
                flag = true;
                break;
            }
        }
        System.out.println((flag) ? "Found" : "Not Found");
    }
}
