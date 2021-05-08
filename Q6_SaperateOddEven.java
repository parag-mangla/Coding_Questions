public class Q6_SaperateOddEven {

    public static void saperateOddEven(int[] a){
        int[] odd = new int[a.length];
        int[] even = new int[a.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 == 0){
                even[evenIndex] = a[i];
                evenIndex++;
            }
            else{
                odd[oddIndex] = a[i];
                oddIndex++;
            }
        }
        System.out.println("Odd array : ");
        printArray(odd);
        System.out.println("Even array : ");
        printArray(even);
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                continue;
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int[] arr = new int[];

        int[] arr = {595,51,451,1,51,21,15,15,151,515,1,518,1,6,88};

        saperateOddEven(arr);

    }
}
