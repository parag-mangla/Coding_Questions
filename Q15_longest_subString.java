import java.util.HashSet;

public class Q15_longest_subString {

    public static String longestSubString(String s){

        HashSet<Character> set = new HashSet<>();
        String longestOverall= "";
        String longestTillNow= "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                longestTillNow="";
                set.clear();
            }
            set.add(c);
            longestTillNow+=c;

            if(longestTillNow.length() > longestOverall.length()){
                longestOverall = longestTillNow;
            }
        }
        return longestOverall;
    }

    public static void main(String[] args) {
        String str = "programmer";
        String ans = longestSubString(str);

        System.out.println(ans);
    }
}
