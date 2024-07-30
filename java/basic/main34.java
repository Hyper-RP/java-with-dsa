package basic;

import java.util.Scanner;

public class main34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("to check perfect number : ");
        int num=input.nextInt();
        int i=num-1;
        int temp=0;
        int sum=0;
        while (i>=1){
            temp=num%i;
            if(temp==0){
                sum=sum+i;
            }
            i--;

        }if(sum==num){
            System.out.println(num+" is a perfect number ");
        }
        else{
            System.out.println(num+" is not a perfect number  ");
        }
    }
}
