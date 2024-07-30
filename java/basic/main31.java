package basic;

import java.util.Scanner;

//whether the string is palindrome or not
public class main31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        int len=name.length()-1;
        String oirginal="";
        while(0<=len){
            oirginal=oirginal+(name.charAt(len));
            len--;
            if(name.equals(oirginal)){
                System.out.println(name+" is a palindrome ");
            }
        }if (!name.equals(oirginal)){
            System.out.println(name +" is not a palindrome");
        }
    }
}
