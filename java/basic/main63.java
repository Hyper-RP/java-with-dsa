package basic;


class nonstatic1{
       class static1{
         void show(){
             System.out.println("I am static");
         }
     }

    void show1(){
        System.out.println("I am non-static");
    }
}


public class main63 {
    public static void main(String[] args) {

        System.out.println("main class");

        nonstatic1 st=new nonstatic1();
        nonstatic1.static1 st1=st.new static1();
        st1.show();
        st.show1();


    }
}
