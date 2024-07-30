package basic;

import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a string");
        String str=input.next();

        String rev="";

        for (int  i = str.length()-1; i >=0; i--) {
            rev = rev+str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.print("given string is palindrome ");
            System.out.println(rev);
        }
        else{
            System.out.print("given string is not palindrome ");
            System.out.println(rev);
        }

    }
}
