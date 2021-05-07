class test{
    public static void result(int[] a1, int[] a2){
        int len1 = a1.length;
        int len2 = a2.length;

        if(len1 ==0 || len2==0 ){
            System.out.println("-1");
        }
        else{
            int sum=0;
            for(int i=0; i<len1; i++){
                int prod = a1[i]*a2[len2-1];
                sum = sum+prod;

                System.out.println(a1[i]+"*"+a2[len2-1]+"="+prod);
                System.out.println(sum);

                len2--;
            }
        }
    }
}
public class AccentureQ1 {
    public static void main(String[] args) {
        int[] arr1 = {22, 7, 1, -5, 5, -2};
//        int[] arr2 = {4, -1, 21, 12, 10, -3};
        int[] arr2 = {};
        test.result(arr1, arr2);
    }
}
