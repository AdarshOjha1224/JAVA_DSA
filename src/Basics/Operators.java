package Basics;


public class Operators {
    public static void main(String[] args) {
        int a = 6 ;
        int b = 4 ;
        int c = a%b ;
        System.out.println(c);

        // is a<b then a%b = a
        // a%(-b) = a%b
        // (-a)%b = -(a%b)
        // for example -> (-39)%(-10) = (-39)%10 = -(39%10) = -9
    }
}
