package basic;

import java.util.Scanner;

public class main11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int res=0;
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            res=a+b;
            a=b;
            b=res;
            count++;

        }  System.out.println(res);



        }
}
