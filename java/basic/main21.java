package basic;

import java.util.Scanner;

//calculate the distance between two points
public class main21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x1, y1,x2,y2;
        System.out.println("enter the first co-ordinates :");
        x1=input.nextInt();
        y1=input.nextInt();
        System.out.println("enter the second co-ordinates :");
        x2=input.nextInt();
        y2=input.nextInt();
        double res=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println(res);
    }


}
