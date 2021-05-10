//Q13. Find number of words in a string, there could be spaces in front, in between and in the end.
//also print all the words


public class Q13_Count_words_in_string {
    public static int countWords(String s){
        int count = 0;
        String[] arr = new String[s.length()/2];
        int i=0;

        while(i < s.length()-1) {
            while (s.charAt(i) == ' ') i++;
                int j = i;
                while (s.charAt(i) != ' ') i++;
                    String word = s.substring(j, i);
                    System.out.println(word);
                    arr[count] = word;
                    count++;

            i++;
        }
        return count;
    }


    public static void main(String[] args) {
        String s = "     hello I am     Java  programmer   who love to code everyday. ";

        System.out.println("number of words: "+countWords(s));
    }
}


//OUTPUT:
//        hello
//        I
//        am
//        Java
//        programmer
//        who
//        love
//        to
//        code
//        everyday.
//        number of words: 10