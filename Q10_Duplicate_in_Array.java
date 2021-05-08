public class Q10_Duplicate_in_Array {

    public static void duplicateOfArray(String[] a){
        int index = 0;
        boolean haveDup = false;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i].equals(a[j])){
                    haveDup=true;
                    index= i;
                }
            }
        }

        if(haveDup){
            System.out.println("Found Duplicate : "+a[index]);
        }
        else{
            System.out.println("Duplicate NOT FOUND");
        }
    }

    public static void main(String[] args) {
        String[] names = {"java", "raman", "rahul","rohan","c++","C","python","c++"};

        duplicateOfArray(names);
    }
}
