package basic;

import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("");
        char ch=input.next() .charAt(0);
        if(ch>'a' && ch<'z'){
            System.out.println(ch+" lowercase");
        }
        else{
            System.out.println(ch +" uppercase");
        }
    }
}
