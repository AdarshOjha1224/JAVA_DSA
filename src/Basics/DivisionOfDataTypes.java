package Basics;

public class DivisionOfDataTypes {
    public static void main(String[] args) {
        double x = 5/2; // 2.0
        System.out.println(x);
        double y = 5.0/2; // 2.5
        System.out.println(y);

        // i integer and d double
        // i/i -> i
        // d/i -> d
        // d/d -> d
        // i/d -> d

        int p = 35 , r = 12 , t = 3 ;
        double si = p * r * t / 100.0; // 12.6
        System.out.println(si);

    }
}
