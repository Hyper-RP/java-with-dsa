package basic;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=input.nextInt();
        System.out.println("enter num2");
        int num2=input.nextInt();

        if(num1>num2){
            System.out.println(num1+" is greater");
        }
        else{
            System.out.println(num2+" is greater");

        }
    }
}
