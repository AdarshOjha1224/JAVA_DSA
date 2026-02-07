package Basics;

public class AreaOfCircle {
    public static void main(String[] args) {
        double r = 3.8;
        double a = 3.141592 * r * r;
        System.out.println(a);

        // Volume of circle --
        // Meaning of 4/3 and 4.0/3 is different --
        double v = 4.0/3 * 3.141592 * r * r * r ;
        System.out.println(v);
    }
}
