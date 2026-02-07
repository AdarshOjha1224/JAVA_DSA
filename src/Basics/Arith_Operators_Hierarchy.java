package Basics;

public class Arith_Operators_Hierarchy {
    public static void main(String[] args) {


        // The priority of [ / , * , % ] > [ + , - ].
        // check first the operators according to the above rule
        // If the operators are from one side the apply the rule
        // LEFT TO RIGHT

        int a = 2 * 4 / 5 ; // = 8/5 = 1
        System.out.println(a);

        int b = 2*4 + 6/7 ; // = 8 + 6/7 = 8 + 0 = 8
        System.out.println(b);

    }
}
