package basic;

import java.util.Scanner;

public class main17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the count of numbers : ");
        int count=in.nextInt();
        int count1=count;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the numbers");
        int num=0;
        int sum=0;
        int avg;

        for (int i = 0; count > 0 ; i++) {
           num=input.nextInt();
           sum=sum+num;
           count--;
        }
        avg=sum/count1;
        System.out.println("the sum is : "+sum);
        System.out.println("the average  is : "+avg);
        System.out.println("the count is : "+count1);
        }

    }

