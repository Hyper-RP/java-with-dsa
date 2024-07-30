package basic;

import java.util.Scanner;
//calculate depreciation value of product
public class main26 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the present value of product : ");
        int p=input.nextInt();
        System.out.println("enter a depreciation percentage (yearly) : ");
        int d=input.nextInt();
        System.out.println("for how many years : ");
        int n=input.nextInt();
        double res=(p*Math.pow(1-0.01*d,n));
        System.out.println("the depreciation value of product is : "+res);
    }
}
