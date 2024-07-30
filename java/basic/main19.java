package basic;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class main19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number : ");
        int large=0;
        int n;
        int n1 = 0;
        
     while (true){
         n=input.nextInt();
         for (int i = 0; large < n; i++) {
             large=n;
             n=large;
             n1 = n;
         }
         if (n==0){
             break;
         }
         
     }
        System.out.println(n1 +"is large");

        }

    }

