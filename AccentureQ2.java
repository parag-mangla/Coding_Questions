class test2{
    public static String reverse(String s){
        int i = s.length()-1;
        String ans ="";

        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;

            int j=i;

            while(i>=0 && s.charAt(i)!=' ') i--;
            if(ans.isEmpty()){
                ans = ans.concat(s.substring(i+1,j+1));
            }
            else {
                ans = ans.concat(" "+ s.substring(i+1, j+1));
            }
        }
        return ans;
    }
}


public class AccentureQ2 {

    public static void main(String[] args) {

        String s = "hello    i love mettl     ";

        String a = test2.reverse(s);
        System.out.println(a);


    }
}
