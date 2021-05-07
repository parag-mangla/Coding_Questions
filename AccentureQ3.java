class test3{
    public static void maxNum_index(int[] a){

        int max =a[0];
        int index =0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
                index=i;
            }
        }
        System.out.println("maximum: "+ max+ " index: "+index);
    }
}

public class Acceture3 {
    public static void main(String[] args) {

        int[] ar = {1, 9, 11, 144, 6, 7, 112, 95, 666};

        test3.maxNum_index(ar);

    }
}
