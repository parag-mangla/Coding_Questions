public class Q2_Number_of_digits {
    public static int numberOfDigits(int num){
        int count =0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1235332394;

        int ans = numberOfDigits(n);
        System.out.println(ans);
    }
}
