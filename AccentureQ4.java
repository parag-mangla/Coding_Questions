class test4 {
    public static void result(int[] a, int k){
        int len = a.length;
        int count =0;
        if(k==1){
            for(int i=0; i<len; i++){
                if(a[i] < 10){
                    count++;
                }
            }
        }
        if(k==2){
            for(int i=0; i<len; i++){
                if(a[i] >=10 && a[i]<100){
                    count++;
                }
            }
        }
        if(k==3){
            for(int i=0; i<len; i++){
                if(a[i] >=100 && a[i]<1000){
                    count++;
                }
            }
        }
        if(k==4){
            for(int i=0; i<len; i++){
                if(a[i] >=1000 && a[i]<10000){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

public class Accenture4 {
    public static void main(String[] args) {

        int[] arr = {332,1,302,41,44,95,122,85,65,3221,775,12};
        int k=4;

        test4.result(arr,k);
    }
}
