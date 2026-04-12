package Sorting_Algorithms;
import java.util.ArrayList;

public class _9_UnionOfTwoSortedArray {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0 , j = 0 , la = a.length, lb = b.length;
        while (i < la && j < lb) {
            if(a[i] <= b[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1) != a[i]){
                    arr.add(a[i]);
                }
                i++;
            }
            else{
                if(arr.isEmpty() || arr.get(arr.size()-1) != b[j]){
                    arr.add(b[j]);
                }
                j++;
            }
        }
        while(i<la){
            if(arr.isEmpty() || arr.get(arr.size()-1) != a[i]){
                arr.add(a[i]);
            }
            i++;
        }
        while(j<lb){
            if(arr.isEmpty() || arr.get(arr.size()-1) != b[j]){
                arr.add(b[j]);
            }
            j++;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[]  a = {1,2,2,3,4,5,6,7};
        int[] b = {1,2,2,3,4,7,8,8};
        System.out.println(findUnion(a,b));

    }
}
