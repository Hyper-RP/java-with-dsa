package basic;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("indian rs :");
        int ind= input.nextInt();
        double usd=ind/83.450;
        System.out.println("total USD dollers : "+usd);
    }
}
