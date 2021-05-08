public class Q5_PrimeNumber {
    public static boolean primeNumber(int num){
        boolean isPrime = false;
        for(int i=2; i*i<num; i++){
            if(num % i ==0){
                isPrime=false;
                break;
            }
            else{
                isPrime= true;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int num =5153;


        System.out.println(primeNumber(num));
    }
}
