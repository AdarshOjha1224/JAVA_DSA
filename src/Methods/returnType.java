package Methods;

public class returnType {

    // Return type agar int ya double ho to "return" keyword ka run hona bohot jruri hai.
    public static int first() {
        System.out.println("This is first method !");
        return 5; // End
    }
    public static int second(int a) {
        if(a>0) return 5 ;
        else return 100;
    }



    public static void main(String[] args) {
        first(); // stand alone call lgai bss.
        System.out.println();
        System.out.println(first());
        System.out.println(first()+3);

        int x = first();
        System.out.println(4+x);
        int y = second(2);
        System.out.println(y);
    }

}
