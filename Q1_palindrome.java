class testQ1{
    public static int reverse(int n){
        int rev = 0;
        int rem=0;
        while(n>0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int num){
        int reverse = reverse(num);

        if(num == reverse){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Q1_palindrome {
    public static void main(String[] args) {

        int num =46264;

        System.out.println(testQ1.isPalindrome(num));

    }
}
