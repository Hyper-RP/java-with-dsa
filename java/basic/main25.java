package basic;

import java.util.Scanner;

//calculate commison percentage
public class main25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter total amount :");
        int amount=input.nextInt();
        System.out.println("enter how many amount you get : ");
        int money=input.nextInt();
        int percent=(amount*money)/100;
        System.out.println(percent+" % it's your commission percentage ");
    }


}
