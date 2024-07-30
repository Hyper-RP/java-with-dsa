package basic;

import java.util.Scanner;

public class main23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name :");
        String name=input.next();
        System.out.println("enter a number :");
        int num=input.nextInt();
        int digit=0;
        int divide=num;
        int remainder=num;
        int modulo;
        double sum=0;
        double res=0;
        for (int i = 0; 0< divide; i++) {
            divide = divide/ 10;
            digit++;
        }
            for (int j = 0;0<remainder; j++) {
               modulo=remainder%10;
                res = Math.pow(modulo, digit);
                sum=sum+res;
                remainder=remainder/10;
            }

        if (num == sum) {
            System.out.println(num + " is a Armstrong number");
        } else {
            System.out.println(name + " tu pagal aahe ka thodasa "+num+" is not a armstrong number");
        }
        System.out.println(digit+ " digits total");
    }
}
