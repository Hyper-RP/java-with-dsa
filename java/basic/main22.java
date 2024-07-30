package basic;

import java.util.Scanner;

public class main22 {
    public static void main(String[] args) {
        int count=5;
        int total=0;
        int n=count;
        Scanner input=new Scanner(System.in);
        while (n>0){
            int marks=input.nextInt();
            total=total+marks;
            n--;
        }
        int avg=total/count;
        System.out.println("average :"+avg);
    }
}
