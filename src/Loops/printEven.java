package Loops;

public class printEven {
    public static void main(String[] args) {
        for(int i = 0; i <= 100 ; i++){          // Runs 100 times
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Smarter way
        for(int i = 0 ; i<=100 ; i+=2){        // Runs only 50 times
            System.out.print(i + " ");
        }
    }
}
