package basic;

import java.util.Scanner;

public class main30 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        int temp=num;
        int modulo;
        int res=0;


        while( 0 < temp) {
            modulo=temp%10;
            System.out.print(modulo);
            res=res*10+modulo;
            temp=temp/10;

            if(num==res){
                System.out.println(" the given number is palindrome ");
            }
        }
        if (num!=res){
            System.out.println( " is not a palindrome");
        }


    }
}
