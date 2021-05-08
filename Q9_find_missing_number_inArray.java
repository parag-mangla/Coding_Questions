//Q9. find the missing number in the array,
// the array should not have duplicates,
// Array not need to be in sorted order,
// values should be in range.


public class Q9_find_missing_number_inArray {
    public static int sumArray(int[] a){
        int sum =0;
        for(int i=0; i<a.length; i++){
            sum=sum+a[i];
        }
        return sum;
    }
    public static int sumRange(int[] a){
        int min = a[0];
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        int sum=0;
        for(int i=min; i<=max; i++){
            sum =sum+i;
        }
        return sum;
    }
    public static int missingNumber(int[] a){
        int aSum = sumArray(a);
        int aRange = sumRange(a);

        int diff = aRange-aSum;

        return diff;
    }
    public static void main(String[] args) {
        int[] arr = {4,7,3,5,1,2,6,10};

        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}
