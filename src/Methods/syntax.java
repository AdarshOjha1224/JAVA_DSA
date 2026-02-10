package Methods;

public class syntax {

    public static void first() {
        System.out.println("This is first Function");
    }
    public static void main(String[] args) {
        first();
        System.out.println("This is main Function");
        second();
    }
    public static void second() {
        first();
        System.out.println("This is second Function");
    }
}
