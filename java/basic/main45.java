package basic;
//Define a method that returns the product of two numbers entered by user.
public class main45 {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int mul=ischeck(num1,num2);
        System.out.println("the multiplication  is : "+mul);
    }
    static  int ischeck(int n1,int n2){
        int mul=n1*n2;
        return mul;
    }
    }
