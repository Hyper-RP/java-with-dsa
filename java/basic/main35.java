package basic;

import java.util.Scanner;

//check leap year
public class main35 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("to check year is leap or not");
        int year=2005;
        if(year%4==0&&year%100!=0){
            System.out.println(year+" is a leap year");
        }
    }
}
