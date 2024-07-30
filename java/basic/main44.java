package basic;
//Write a program to print the sum of two numbers entered by user.
// define your own method.
public class main44 {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int sum=ischeck(num1,num2);
        System.out.println("the sum is : "+sum);
    }
    static  int ischeck(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
}
