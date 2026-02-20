package OOP;

import java.util.Arrays;

public class Marks {
    public static class StudentData{
        String name ;
        int rollno;
        int[] marks;

        StudentData(int[] x){
            marks = Arrays.copyOf(x,x.length);
        }
        StudentData(int x){
            marks = new int[x];
        }
    }

    // particular class ka array badalna chahta hu

    public static void main(String[] args) {
        int[] arr = {5,8,9,7,6};
        StudentData s1 = new StudentData(arr);
        s1.marks[0] = 90;
        System.out.println(arr[0]);
        StudentData s2 = new StudentData(2);
        s2.marks[0] = 91;
        s2.marks[1] = 88;
        s2.marks[2] = 80;

//        StudentData s2 = new StudentData(3);
//        s1.marks[0] = 90;
//        s1.marks[1] = 87;
//        s1.marks[2] = 56;
//        s1.marks[3] = 78;


    }
}
