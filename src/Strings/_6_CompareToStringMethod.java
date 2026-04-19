package Strings;

public class _6_CompareToStringMethod {
    public static int compareTo(String s1 ,  String s2) {
        int l1 = s1.length() , l2 = s2.length();
        int l = Math.min(l1,l2);
        for(int i = 0 ; i < l ; i++){
            int diff = ((int)(s1.charAt(i))) - ((int)(s2.charAt(i)));
            if(diff != 0){
                return diff;
            }
        }
        return l1-l2;
    }

    public static void main(String[] args) {
        String a = "adarsh";
        String b = "kavya";
        System.out.println(a.compareTo(b)); // a - b = -10
        // a = 97 , b = 107
        // a - b = -10
        System.out.println(compareTo(a,b)); // -10

        String c = "harshita";
        String d = "harmeet";
        System.out.println(c.compareTo(d)); // 6
        // s(115) - m(109) = 6
        System.out.println(compareTo(c,d)); // 6

        // If the string same then it gives the difference of remaining number of char.
        String e = "harsh";
        System.out.println(c.compareTo(e)); // 3
        System.out.println(compareTo(c,e)); // 3

    }
}
