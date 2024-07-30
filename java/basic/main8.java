package basic;

import java.util.Scanner;
/*
code to check
whether the num is armstrong or not
 */
public class main8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num");
        int num = input.nextInt();
        System.out.println("this is your number : " + num);
        int originalNum =num;
        int original= num;
        int digit = 0;
        int remainder;
        int result;
        int sum =0;
        for (int i = 0; originalNum > 0; )
            {
                originalNum= originalNum / 10;
                digit++;
            }
            System.out.println("total no of digit : " + digit);
        while(original >0) {
          result=original%10;
            remainder = (int) (Math.pow(result, digit));
            sum=remainder+sum;
            original=original/10;

        }
     if (num==sum){
        System.out.println(num +" "+"is armstrong number" );
    }
     else {
         System.out.println(num +" "+"is not a armstrong number" );
     }
    }
}



