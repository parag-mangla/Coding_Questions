public class Q3_EvenOddDigits_inNumber {
    public static void OddEven(int num){
        int rem =0;
        int oddCount = 0;
        int evenCount = 0;
        while(num>0) {
            rem = num % 10;
            if (rem % 2 == 0) evenCount++;
            else oddCount++;
            num = num / 10;
        }
        System.out.println("Odd Digits: "+oddCount+ " Even Digits: "+evenCount);
    }
    public static void main(String[] args) {
        int num = 145678;
        OddEven(num);
    }
}
