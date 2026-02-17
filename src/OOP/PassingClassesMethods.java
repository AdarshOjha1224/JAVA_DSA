package OOP;

public class PassingClassesMethods {

    public static class Car{
        // these are the attributs or members of this class
        int seats;
        String name ;
        double length ;
        String type ;
        int torque;

        void print(){
            System.out.println(seats + " " + name + " " + length + " " + type + " " + torque);
        }
    }
    public static void main(String[] args) {

//  HERE WE USE THE OTHER JAVA FILES CLASS WHICH SEEMS TO BE IN THE OOP PACKAGE.

//        Student s1 = new Student();
//        s1.cgpa = 6.5;
//        System.out.println(s1.cgpa);
        Car c = new Car();
        c.length = 3.99;
        c.name = "Tata Punch";
        c.seats = 5;
        c.torque = 150;
        c.type = "SUV";

        // if we are pass the objects in the functions -> pass by reference
        // we can say -> Shallow copy


        change(c);
        System.out.println(c.seats);
        c.print();

    }

    private static void change(Car c){
        c.seats = 4;
    }
}
