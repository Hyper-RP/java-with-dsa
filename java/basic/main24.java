package basic;

//calculate batting average
import java.util.Scanner;

public class main24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Total no.of matches you played :");
        int match=input.nextInt();
        System.out.println("Total runs : ");
        int runs=input.nextInt();
        System.out.println("How many times you are getting out : ");
        int out=input.nextInt();
        int notout=match-out;
        int res=(runs/notout);
        System.out.println();


    }
}
