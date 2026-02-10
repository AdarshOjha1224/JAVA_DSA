package Methods;

public class arguments {
    public static void sum(int a , int b , int c) {
        // here a and b are parameters
        System.out.println(a+b+c);
    }

//    public static void max ( int a , int b , int c) {
//        if(a>=b && a>=c) System.out.println(a);
//        else if (b>=a && b>=c) System.out.println(b);
//        else System.out.println(c);
//    }


    // with return -->

    public static int max(int a , int b , int c){
        if(a>=b && a>=c) return a ;
        else if (b>=a && b>=c) return b ;
        else return c ;
    }

    public static void main(String[] args) {
        sum(5,3,10); // here 5 and 3 are arguments
        System.out.println(max(4,2,6));
    }
}
