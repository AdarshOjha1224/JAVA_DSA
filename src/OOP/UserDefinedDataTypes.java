package OOP;
import java.util.Scanner;

// if i write this class outside the below class then we can use it in other files. which means it is in OOP Package.


class Student{
    String name ;
    int roll ;
    double cgpa ;

    void print(){
        System.out.println(name + " " + roll + " " + cgpa);

    }
}


public class UserDefinedDataTypes {
    // Objects are real-life entities and class is a blueprint.

//  If i write this class inside then it is bounded to this file only.

//    public static class Student{
//        String name ;
//        int roll ;
//        double cgpa ;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student() ;
        s1.name = "Adarsh Ojha";
        s1.roll = 1004;
        s1.cgpa = 7.8 ;

        Student s2 = new Student();
        s2.name = "Abhishek Rajput";
        s2.roll = 1002 ;
        System.out.print("Enter the cgpa of " + s2.name + " : ");
        s2.cgpa = sc.nextDouble();

        Student s3 = new Student();
        s3.name = "Abhishek Sharma";
        s3.roll = 1003 ;
        s3.cgpa = 7 ;

        System.out.println(s1.name + " " + s1.roll + " " + s1.cgpa);
        s3.cgpa = 7.3 ;
        System.out.println(s3.cgpa);
        System.out.println(s2.cgpa);

        s1.print();
        s2.print();
        s3.print();


    }
}
