package Arrays;

public class segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,0,0,0};

        int n = 0 ;
        for(int ele : arr) if(ele==0) n++;
        for(int i=0 ; i < arr.length ; i++) arr[i]= (i<n) ? 0 : 1 ;

        for(int ele : arr) System.out.print(ele + " ");

//        int n = arr.length;
//        int i = 0 , j = n-1;
//        while(i<j){
//            if(arr[i]==0) i++;
//            else if(arr[j]==1) j--;
//            else if(arr[i]==1 && arr[j]==0){
//                arr[i] = 0 ;
//                arr[j] = 1 ;
//                i++;
//                j--;
//            }
//        }
//        for(int ele : arr) System.out.print(ele + " ");
    }
}
