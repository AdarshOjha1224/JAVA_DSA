package Strings;

import java.util.Scanner;

public class _4_PalindromeString {
    // String in methods -> pass by value (Immutable)
    public static boolean isPalindrome(String s) {
        int left = 0 , right = s.length() - 1;

        // if there is only alphanumeric characters are present in the string.
//        while(left < right){
//            if(s.charAt(left) != s.charAt(right)) return false;
//            left++;
//            right--;
//        }
//        return true;


        // if there is also non-alphanumeric characters are present in the string.

        // MY METHOD ->>

//        String fs = s.replaceAll("[^a-zA-Z0-9]", "");
//        fs = fs.toLowerCase();
//        int left = 0 , right = fs.length() - 1;
//        while(left<right){
//            if(fs.charAt(left) != fs.charAt(right)) return false;
//            left++;
//            right--;
//        }
//        return true;


        // Most Efficient way with 1ms runtime.

        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!((l>='A' && l<='Z') || (l>='a' && l<='z') || (l>='0' && l<='9'))) left++;
            else if(!((r>='A' && r<='Z') || (r>='a' && r<='z') || (r>='0' && r<='9'))) right--;
            else{
                if((l>='A' && l<='Z')) l = (char)(l+32);
                if((r>='A' && r<='Z')) r = (char)(r+32);
                if(l!=r) return false;
                left++;
                right--;
            }
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
