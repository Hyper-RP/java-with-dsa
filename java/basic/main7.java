package basic;

import java.util.Scanner;



public class main7 {
    //to find armstrong number
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter an number : ");
        String num=input.next();
        System.out.println("type it again");
        int num1=input.nextInt();

        int len=num.length();
        double calculate=Math.pow(len,num1);
        System.out.println(calculate);
    }
}
