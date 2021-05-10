public class Q16_implement_Stack_using_array {

    int[] arr = new int[10];
    int top=0;

    public void push(int num){
        System.out.println("Element pushed : "+ num);
        top++;
        arr[top] = num;
    }
    public void pop(){
        System.out.println("Element popped : "+arr[top]);
        arr[top]=0;
        top--;
    }
    public void peek(){
        System.out.println("Element peeked : "+arr[top]);
    }
    public void print(){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q16_implement_Stack_using_array stack = new Q16_implement_Stack_using_array();
        stack.push(12);
        stack.push(13);
        stack.push(17);
        stack.push(19);
        stack.push(20);

        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        stack.peek();
        stack.print();

    }
}
