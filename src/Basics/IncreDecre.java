package Basics;

public class IncreDecre {
    public static void main(String[] args) {
        int a = 10 ;
        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++a); // 12
        System.out.println(a--); // 12
        System.out.println(a); // 11
        System.out.println(--a); // 10

        // important concept

        int x = 10 ;
        int y = x++ ;
        System.out.println(x+ " " +y);
        y = ++x ;
        System.out.println(x+ " " +y);

    }
}
