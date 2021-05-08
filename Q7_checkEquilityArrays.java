public class Q7_checkEquilityArrays {
    public static void areEqual(int[] a1, int[] a2){
        boolean equal = false;
        int index =-1;
        if(a1.length == a2.length){
            for(int i=0; i<a1.length; i++){
                if(a1[i]==a2[i]){
                    equal=true;
                }
                else{
                    equal=false;
                    index = i;
                    break;
                }
            }
        }
        else{
            equal = false;
        }
        System.out.println("equility: "+equal);
        if(index != -1){
            System.out.println("error at index: "+index);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,6,9,10};
        int[] arr2 = {1,3,4,5,6,9,10};

        areEqual(arr1,arr2);

    }
}
