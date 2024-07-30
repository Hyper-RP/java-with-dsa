package basic;
//Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;

public class main18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number : ");
        int sum=0;
        while (true){
            int num=input.nextInt();
            sum=sum+num;
            if (num==0){
                break;
            }
        }
        System.out.println("the sum of all numbers : "+sum);
    }
}
