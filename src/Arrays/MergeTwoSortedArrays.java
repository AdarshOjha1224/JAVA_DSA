package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        // HW - in the last of lecture 6
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2,4,6,8,10};
        int[] c = new int[a.length+b.length];

        // Ghatiya tareeka (High complexity) ->>

//        for(int i = 0 ; i < a.length ; i++) c[i] = a[i];
//        for(int i = a.length ; i < b.length +  a.length ; i++) c[i] = b[i-a.length];
//        Arrays.sort(c);

        merge(a,b,c);
        for(int ele : c) System.out.print(ele + " ");
    }

    public static void merge(int[] a , int[] b , int[] c){
        int i = 0 , j = 0 , k = 0 ;
        while(i < a.length && j < b.length) c[k++] = a[i] <= b[j] ? a[i++] : b[j++];
        while (j < b.length) c[k++] = b[j++];
        while (i < a.length) c[k++] = a[i++];
    }
}