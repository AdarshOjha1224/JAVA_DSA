package OOP;

import org.w3c.dom.ls.LSOutput;

class Students{
    // EXAMPLE OF ENCAPSULATION --
    // when all the attributes are private.

    String name ; // default -> null
    private int rollno = 1004 ; // 0
    double cgpa ; // 0.0

    private void print(){  // GETTER
        System.out.println(name + " " + rollno + " " + cgpa);
    }

    int getRollno(){   // GETTER
        return rollno;
    }
    void setRollno(int x){   // SETTER
        rollno = x ;
    }

//    public void p(){
//        print();
//    }

}


public class PrivateKeyword {

    public static void main(String[] args) {
        Students s1 = new Students();
//        s1.print();
        s1.name = "Adarsh Ojha";
        s1.cgpa = 7.9;
//        s1.rollno = 1004;
        s1.setRollno(1004);
        System.out.println(s1.getRollno());

        Students s2 = new Students();
        s2.name = "Halwai";
        s2.cgpa = 8 ;


    }
}
