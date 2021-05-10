//Q14. you are given a string print all substrings possible and also print number of substrings possible.

public class Q14_substring_of_String {
    public static void subString(String s){
        int i=0;
        int count=0;
        while(i < s.length()){
            int j=i;
            while(j < s.length()) {
                System.out.println(s.substring(i,j+1));
                count++;
                j++;
            }
            i++;
        }
        System.out.println("No. of Substrings: "+count);
    }

    public static void main(String[] args) {
        String str = "Flabercasting";

        subString(str);
    }
}


// OUTPUT:
//        C
//        Co
//        Cod
//        Code
//        Coder
//        o
//        od
//        ode
//        oder
//        d
//        de
//        der
//        e
//        er
//        r
//        No. of Substrings: 15