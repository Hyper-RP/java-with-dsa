package Stack;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("peek : "+st.peek());
        System.out.println("pop : "+st.pop());
        st.push(4);
        System.out.println("size : "+st.size());
        st.add(0,10);
        System.out.println("search : "+st.search(10));
        System.out.println("capacity : "+st.capacity());
        System.out.println(st);
    }
}
