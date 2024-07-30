package basic;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class main42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num  : ");
        int num=input.nextInt();
        ischeck(num);
    }
    static void ischeck(int n){
        if (n%2==0){
            System.out.println(n+" is even");
        }
        else
            System.out.println(n+" is odd");
    }
}