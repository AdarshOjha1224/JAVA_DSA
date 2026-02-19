package OOP;

import org.w3c.dom.ls.LSOutput;

public class polymorphism {
    public static class Adarsh{
        void speak(){
            System.out.println("Hello i am Adarsh Ojha");
        }
    }
    public static class Abhishek{
        void speak(){
            System.out.println("Hello i am Abhishek");
        }
    }
    public static class Halwai{
        void speak(){
            System.out.println("Hello i am Halwai");
        }
    }
    public static class Aman{
        void speak(){
            System.out.println("Hello i am Aman ");
        }
    }

    public static void main(String[] args) {

        Adarsh a1 = new Adarsh();
        Abhishek ab1 = new Abhishek();
        Halwai h1 = new Halwai();
        Aman am1 = new Aman();

        a1.speak();
        ab1.speak();
        h1.speak();
        am1.speak();
    }
}
