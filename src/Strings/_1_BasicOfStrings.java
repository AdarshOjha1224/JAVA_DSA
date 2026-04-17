package Strings;

import java.util.Scanner;

public class _1_BasicOfStrings {
    public static void main(String[] args) {
        // String is a Character Array.
        char[] ch = {'a','d','a','r','s','h'};
        for(char ele : ch) System.out.print(ele);
        String str = "Adarsh";
        System.out.println(str);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str1 = input.next();
        System.out.println(str1);
        System.out.print("Enter another string : ");
        String str2 = input.nextLine();
        System.out.println(str2);

    }
}