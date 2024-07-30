package basic;

import java.util.Scanner;

//cgpat to percentage
public class main15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double cgpa= input.nextDouble();
        double res=cgpa*9.5;
        System.out.println("here is your percentage : "+(int)res);
    }
}
