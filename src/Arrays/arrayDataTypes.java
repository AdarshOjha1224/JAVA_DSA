package Arrays;

public class arrayDataTypes {
    public static void main(String[] args) {
        char a = '\n';
        System.out.println((int)a); // ascii value of \n is 0

        int x = 0 ;
        System.out.println((char)x);

        double[] arr = new double[5];

        for(int i = 0 ; i < arr.length ; i++){  // 0.0 0.0 0.0 0.0 0.0
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String[] y = {"Adarsh","Aman","Abhishek"};
        for(int i = 0 ; i< y.length; i++){
            System.out.print(y[i]+" ");
        }
    }
}