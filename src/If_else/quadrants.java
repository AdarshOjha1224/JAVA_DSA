package If_else;

import java.util.Scanner;

public class quadrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of point x :");
        int x = sc.nextInt();
        System.out.print("Enter the value of point y :");
        int y = sc.nextInt();

//        points -> I , II , III , IV , O , X , Y

        if(x==0){
            if(y==0) System.out.println("ORIGIN");
            else System.out.println("Y-axis");
        }
        else if (x>0) {
            if (y==0) System.out.println("X-axis");
            else if (y>0) System.out.println("1st Quadrant");
            else System.out.println("4th Quadrant");
        }
        else {
            if (y>0) System.out.println("2nd Quadrant");
            else System.out.println("3rd Quadrant");
        }
    }
}
