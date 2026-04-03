package Methods;


//Think of a public class as a public building on a street. Anyone walking by can see the building and walk up to it.
//
//However, the methods inside that class are the rooms inside the building. Just because a building is public doesn't mean every single door inside is unlocked. If the main method isn't marked public, it's like locking the front door. The JVM can find your building (the class), but it can't get inside to start the work.

class syntax {

    static void first() {
        System.out.println("This is first Function");
    }
    public static void main(String[] args) {
        first();
        System.out.println("This is main Function");
        second();
    }
    static void second() {
        first();
        System.out.println("This is second Function");
    }
}
