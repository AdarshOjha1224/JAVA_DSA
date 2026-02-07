package Basics;

public class CharDataType {
    public static void main(String[] args) {
        char p = '0';
        System.out.println(p);

        // TypeCasting - data type conversion
        char a = 'a';
        int x = a; // Implicit Typecasting
        System.out.println(x);

        char b = 'A';
        int y = (int)b; // Explicit Typecasting
        System.out.println(y);

        System.out.println(b);
        System.out.println((int)b);

        System.out.println((int)p);

//        for (int i = 0 ; i<=150 ; i++)
//        {
//            System.out.println((char)i);
//        }

        int s = 49;
        char t = (char)s;
        System.out.println("Character at ascii value 49 is " + t);

        // NEW CONCEPT
        char r = 'c';
        System.out.println(r+0); // 99
        System.out.println(r+r); // 99 + 99 = 198
        System.out.println(r*r); // 99 * 99 = 9801
        System.out.println(r*1); // 99 * 1 = 99
    }
}