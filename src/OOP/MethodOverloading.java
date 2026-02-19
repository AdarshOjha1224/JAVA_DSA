package OOP;

public class MethodOverloading {

        public static int max(int a , int b){
            return Math.max(a,b);
        }
        public static int max(int a , int b , int c) {
            return Math.max(a, Math.max(b, c));
        }


    public static void main(String[] args) {

        System.out.println(max(2,5,8));
        System.out.println(max(5,9));

    }
}