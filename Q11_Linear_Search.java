public class Q11_Linear_Search {
    public static void LinearSearch(int[] arr,int n){
        int comparison = 0;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                found = true;
                comparison++;
                break;
            }
            comparison++;
        }
        if(found){ System.out.println("FOUND  "+"comparisons: "+comparison); }
        else{ System.out.println("NOT FOUND  "+"comparisons: "+comparison); }
    }

    public static void main(String[] args) {
        int[] ar = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int num = 11;
        LinearSearch(ar,num);
    }
}
