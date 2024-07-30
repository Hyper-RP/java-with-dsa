package basic;

import java.util.Scanner;

//whether the number is perfect no. or not.
public class main33 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = input.nextInt();
        int temp = num;
        int divisor;
        int fact = 1;
        int modulo = num;
        int sum = 0;
        for (int i = 0; 0 < temp; i++) {
            modulo = temp % 10;
            sum = sum + modulo;
            temp = temp / 10;
        }
        if (fact == sum) {
            System.out.println(num + " is a perfect number");
        }else{
            System.out.println(num+" is not a perfect number");
        }
    }
}