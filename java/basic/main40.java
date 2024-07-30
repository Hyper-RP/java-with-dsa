package basic;

import static java.lang.Integer.sum;

//java methods swap numbers
public class main40 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
        swap(10, 20);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a + " " + " " + b);


    }
}