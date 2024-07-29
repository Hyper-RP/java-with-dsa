/*
 * Given a signed 32-bit integer x, return x with its digits reversed.
 *  If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */

import java.util.Scanner;

public class reverse_integer {
    static int reverse(int x) {
        double min=Math.pow(-2,31);
        double max=Math.pow(2,31);
        int modulo=x;
        int temp=0;
        long rem=0;
        for (int i = 0; 0 < modulo||0>modulo; i++) {
            temp=modulo%10;
            rem=(rem*10)+temp;
            modulo=modulo/10;
        }System.out.println(rem);
        if(rem>max||rem<min){
            rem=0;
            System.out.println(rem);
        }
        return(int) rem;
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        reverse(num);
    }
}
