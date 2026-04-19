package Strings;

public class _5_ChangeTheStringOnfirst {
    public static String modify(String s) {
        if(((int)(s.charAt(0))) < 96) return s.toUpperCase();
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(modify("Adarsh")); // ADARSH
        System.out.println(modify("haPPy")); // happy
    }
}
