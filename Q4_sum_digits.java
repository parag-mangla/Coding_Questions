public class Q4_sum_digits {
    public static void sumDigits(int num){
        int sum=0;
        int rem=0;
        while(num>0){
            rem = num % 10;
            sum = sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
    public static void productDigits(int num){
        int prod=1;
        int rem=0;
        while(num>0){
            rem = num % 10;
            prod = prod*rem;
            num=num/10;
        }
        System.out.println(prod);
    }

    public static void main(String[] args) {
        int num = 4456;

        sumDigits(num);

        productDigits(num);

    }
}
