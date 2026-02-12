package Arrays;

public class passingArrayToMethods {
    public static void change(int[] y){
        y[2] = 99;
    }

    // pass value by reference
    public static void main(String[] args) {
        int[] x = {1,2,3,4};   // x is a variable which is point the addresses of the array
        System.out.println(x[2]);
        change(x);              // here we pass the address of x in the method ,
                                // that's why y also has same address as x
                                // whenever we pass the array in method then array is passed by reference
        System.out.println(x[2]);
    }
}
