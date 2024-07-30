package basic;
//reversing a number
import java.util.Scanner;

public class main13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int temp=num;
        while(temp>0){
            int n=temp;
            n=n%10;
            System.out.print(n);
            temp/=10;

        }


    }
}
