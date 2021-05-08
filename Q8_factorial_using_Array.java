public class Q8_factorial_using_Array {
    public static int[] factorial(int n){
        int[] ar = new int[n];
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                ar[count]= i;
                count++;
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        int num = 60;

        int[] arr = factorial(num);

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
