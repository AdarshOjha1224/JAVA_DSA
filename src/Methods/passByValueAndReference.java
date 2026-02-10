package Methods;

public class passByValueAndReference {
    public static void change(int x){             // YE X
        x = 10 ;
    }
                                                          // DONO ALAG ALAG HAIII


    public static void main(String[] args) {
        int x = 5 ;                              // YE WALA X
        System.out.println(x); // 5
        change(x); // value ja rahi hai
        System.out.println(x); // 5
    }

}
