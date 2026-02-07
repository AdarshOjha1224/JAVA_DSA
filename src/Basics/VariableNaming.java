package Basics;

public class VariableNaming {
    public static void main(String[] args) {
        // ONLY _ or alphabet or $ allowed to start the name of variable
        // special characters - !@#$%^&*()[]{}|\'"<>,./?
        // special characters are not allowed anywhere in the name except _ or $
        // numbers are not allowed to start the name of variable
        // keywords are not allowed
        // case sensitive

        int INT = 4 ;
        int FOR = 5;
        System.out.println(INT);
        int x = 1 , X = 3 ;
        System.out.println(x);
        System.out.print(X);
    }
}
