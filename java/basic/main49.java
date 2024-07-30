package basic;

import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
// E.g.-
//4! = 1 * 2 * 3 * 4 = 24
//3! = 3 * 2 * 1 = 6
//2! = 2 * 1 = 2
//Also,
//1! = 1
//0! = 1
public class main49 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=input.nextInt();

        factorial(num);
    }
    static void factorial(int n){

        int fact=1;
        for (int i = 0; 0 < n; i++) {
            fact=fact*n;
            n=n-1;
        }
        System.out.println(fact);
    }
}
