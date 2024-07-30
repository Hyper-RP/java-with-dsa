package basic;
//Write a program to print the circumference and area of a circle.
// radius entered by user by defining your own method.
public class main46 {
    public static void main(String[] args) {
        int r=3;
        isarea(r);
    }
    static void isarea(int radius){
        double res=3.14*radius*radius;
        System.out.println("area : "+res);
        double ans=2*3.14*4;
        System.out.println("circumference : "+ans);
    }
}
