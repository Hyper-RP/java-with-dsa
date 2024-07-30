package basic;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String str=input.next();
        System.out.println(str.charAt(0));
       int n = str.length()-1;
        System.out.println(str.charAt(n));
        if(str.charAt(0)==str.charAt(n)){
            System.out.println("given string is palindrome");
        }
        else {
            System.out.println("given string is not palindrome");
        }
    }
}
