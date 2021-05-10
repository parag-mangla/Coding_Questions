//Q17. Check whether a number is perfect square or not.

public class Q17_check_Square {
    public static boolean isSquare(int num){
        boolean isSquare = false;
        for(int i=0; i<=num/2; i++){
            if(i*i == num){
                isSquare = true;
            }
        }
        return isSquare;
    }
    //main function
    public static void main(String[] args) {
        int num = 25;
        System.out.println(isSquare(num));
    }
}

//OUTPUT :

// true