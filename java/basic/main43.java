package basic;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class main43 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name : ");
        String name=input.nextLine();
        System.out.println("enter your age : ");
        int age=input.nextInt();
        ischeck(name,age);
    }
    static void ischeck(String n,int a){
            if(a>=18){
                System.out.println(n+" you are eligible to vote");
            }
            else
                System.out.println(n+" you are not elgible to vote");
    }
}
