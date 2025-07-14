package Stack;

import java.util.Arrays;

public class stack2 {
    public static void main(String[] args) {
        stackImpl st=new stackImpl();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("pop : "+st.pop());
        st.push(4);
        System.out.println("size : "+st.size());
        System.out.println(Arrays.toString(st.arr()));
    }
}



class stackImpl{
    int top=-1;
    int[] arr=new int[5];
    public void push(int n){
        top++;
        if(top>=arr.length) {
            System.out.println("top excedded the stack");
        }
        else{
            arr[top] = n;
        }
    }

    public int pop(){
        if(top>=0){
            return arr[top--];
        }
        return -1;
    }

    public int size(){
        return top+1;
    }

    public int top(){
        if(top>=0){
            return arr[top];
        }
        return -1;
    }

    public int[] arr(){
        return arr;
    }
}
