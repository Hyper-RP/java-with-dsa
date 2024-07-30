package basic;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("num 1 : ");
        int num1=input.nextInt();
        System.out.println("num 2 : ");
        int num2= input.nextInt();
        System.out.print(num1 + " "+num2 + " ");


        int num3 ;
        for (int j = 2; j <=100; j++) {
            num3=num1+num2;
            System.out.print(num3 + " ");
            num1=num2;
            num2=num3;
            num3++;
        }


        }
    }