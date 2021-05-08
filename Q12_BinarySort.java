import java.util.*;


public class Q12_BinarySort {
    public static void binarySearch(int[] a, int num){
        Arrays.sort(a);
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");

        }
        int len= a.length;
        int mid = len/2;
        boolean found = false;
        int comparison = 0;
        if(num<a[mid]){
            for(int i=0; i<mid; i++){
                if(a[i]==num){
                    found=true;
                    comparison++;
                    break;
                }
                comparison++;
            }
        }
        if(num>=a[mid]){
            for(int i=mid; i<len; i++){
                System.out.println(a[i]+" "+num);
                if(a[i]==num){
                    found=true;
                    comparison++;
                    break;
                }
                comparison++;
            }
        }
        if(found){ System.out.println("FOUND  "+"comparisons: "+comparison); }
        else{ System.out.println("NOT FOUND  "+"comparisons: "+comparison); }


    }
    public static void main(String[] args) {
        int[] ar = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int num = 11;
        binarySearch(ar,num);
    }
}
