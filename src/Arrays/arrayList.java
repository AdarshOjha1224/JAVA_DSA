package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        // ArrayList is a Dynamic Array.

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(24);
        arr.add(18);
        arr.add(7);
        arr.add(10);
        arr.add(25);

        System.out.println(arr.get(2)); // arr[2]

        arr.set(3,50); // arr[3] = 50
        System.out.println(arr.get(3));

        System.out.println(arr); // runs a loop in the backend, adds coma and Square brackets. Can't make changes to Array

        int n = arr.size(); // arr.length
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();

        // 24 18 7 50 25
        arr.add(21); // 24 18 7 50 25 21
        arr.add(1,100); // 24 100 18 7 50 25 21
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr); // [24, 100, 7, 50, 25, 21]
        arr.remove(arr.size()-1);
        System.out.println(arr); // [24, 100, 7, 50, 25]
        Collections.reverse(arr);
        System.out.println(arr);

        int i = 0 , j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);

        ArrayList<Character> arr2 = new ArrayList<>();
    }
}
