package Strings;

public class _2_BuiltInMethods {
    public static void main(String[] args) {
        String str = "Adarsh Ojha";
        str.toLowerCase();
        System.out.println(str);
        System.out.println(str.indexOf('r')); // 3
        System.out.println(str.indexOf(' ')); // 6
        System.out.println(str.indexOf('a')); // 2 first appearance
        System.out.println(str.lastIndexOf('a')); // 10 last appearance
        System.out.println(str.indexOf('x')); // -1 not in the string

        System.out.println(str.toLowerCase()); // adarsh ojha
        System.out.println(str.toUpperCase()); // ADARSH OJHA

        String name = "harshita";
        System.out.println(name.contains("harsh"));
        System.out.println(name.startsWith("har"));
        System.out.println(name.endsWith("ita"));
        str.concat(name);
        System.out.println(str); // Adarsh Ojha
        str = str.concat(name); // str = Adarsh Ojhaharshita
        System.out.println(str.concat(name)); // Adarsh Ojhaharshitaharshita

    }
}
