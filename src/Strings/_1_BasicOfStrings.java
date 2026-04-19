package Strings;

import java.util.Scanner;

public class _1_BasicOfStrings {
    public static void main(String[] args) {
        // String is a Character Array.

        char[] ch = {'a','d','a','r','s','h'};
        for(char ele : ch) System.out.print(ele);
        System.out.println();
        String str = "Adarsh";
        System.out.println(str);

        // Difference between next() & nextLine() ->>
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str1 = input.nextLine();
        System.out.println(str1);
        System.out.print("Enter another string : ");
        String str2 = input.next();
        System.out.println(str2);

        String s = "Adarsh Ojha";
        System.out.println(s.charAt(3)); // s[3] = r ;
        System.out.println(s.length()); // s.length = 11.


        String a = "Hello There !";
        a += " My name is Adarsh Ojha ";
        System.out.println(a); // Hello There ! My name is Adarsh Ojha
        a += 24 ;
        System.out.println(a); // Hello There ! My name is Adarsh Ojha 24
        a = 12 + a ;
        System.out.println(a); // 12Hello There ! My name is Adarsh Ojha 24
        a+= 'a';
        System.out.println(a); // 12Hello There ! My name is Adarsh Ojha 24a
        a += '\n';
        a += 'n';
        System.out.println(a); // 12Hello There ! My name is Adarsh Ojha 24a
        // n

        // Left to right.
        System.out.println("Adarsh" + 10 + 20); // Adarsh1020
        System.out.println(10 + 20 + "Adarsh"); // 40Adarsh
        System.out.println(10 + "Adarsh" + 20); // 10Adarsh20
        System.out.println("Adarsh" + (10+20)); // Adarsh30
        System.out.println('A' + 2 + "Adarsh" ); // 67Adarsh

    }
}