package basic;

import java.util.Scanner;

//reverse a string in java
public class main29 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string to reverse :");
        String name=input.nextLine();
        int len=name.length();
        System.out.println("the length is : "+len);
        char res;
        char rev=0;
        for (int i = 0; 0<len; i++) {
            len=len-1;
            int len1=len;
            rev=name.charAt(len1);
            System.out.print(rev);
        }

    }
}
