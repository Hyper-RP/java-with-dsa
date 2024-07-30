package basic;

import java.util.Scanner;

public class main12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int temp=n;int main=temp;
        int count=0;
        while(temp>0){
            int modulo=temp%10;
            if(modulo==3){
                count++;
            } temp=temp/10;
        }
        System.out.println("the count is "+ count);
    }
}
