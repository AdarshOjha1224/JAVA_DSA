package Arrays;

public class multiply_OddEven {

    public static void print(int[] x){
        for(int i = 0 ; i< x.length ; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.print("Original Array : ");
        print(x);
        for(int i = 0 ; i < x.length ; i++) {
            if (i%2==0) x[i]+=10;
            else x[i]*=2;
        }
        System.out.println();
        System.out.print("Modified Array : ");
        print(x);
    }
}
