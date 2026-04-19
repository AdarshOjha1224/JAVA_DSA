package Strings;

import java.util.Scanner;

public class _4_PalindromeString {
    // String in methods -> pass by value (Immutable)
    public static boolean isPalindrome(String s) {
        int left = 0 , right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        sc.close();
        System.out.println((isPalindrome(str)) ? "Its a palindrome !! " : "Its not a palindrome !! ");
    }
}
