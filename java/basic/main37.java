package basic;

import java.util.Scanner;

//Write a program to print the sum of negative numbers,
// sum of positive even numbers and
// the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class main37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = 0;
        int sn = 0;
        int sp = 0;
        int so = 0;
        int temp = num;
        while (temp >= 0) {
            temp = input.nextInt();

            if (temp > 0 && temp % 2 == 0) {
                sp = sp + temp;
            } else {
                so = so + temp;

            }
            if (temp == 0) {
                break;
            }
        }
        System.out.println(so + " is a sum of odd numbers");
        System.out.println(sp + " is a sum of positive numbers");
    }
}