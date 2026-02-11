package Arrays;

public class arraysBasics {
    public static void main(String[] args) {

        int[] x = {6,19,3,5,65,23,54,87};
        //indexing
        for(int i = 0 ; i<x.length ; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
        // updating elements - mutability
        x[3] = 45 ;
        for(int i = 0 ; i<x.length ; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();

        int[] arr = new int[5];// 5 size ka array | 0 to 4
        arr[0] = 10 ;
        arr[1] = 20 ;
        arr[2] = 30 ;
        arr[3] = 40 ;
        arr[4] = 50 ;

        for(int i = 0 ; i<x.length ; i++){
            System.out.print(x[i] + " ");
        }


    }
}
