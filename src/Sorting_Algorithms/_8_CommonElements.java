package Sorting_Algorithms;
import java.util.ArrayList;
import java.util.Arrays;

public class _8_CommonElements {
    public static ArrayList<Integer> commEle(int[] a, int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0 , j = 0 ;
        while(i < a.length && j < b.length) {
            if(a[i] == b[j]) {
                arr.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] > b[j]) j++;
            else i++;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] a = {1,3,2,2,7};
        int[] b = {2,4,2,3,8,6,9};
        System.out.println(commEle(a,b));
    }
}
