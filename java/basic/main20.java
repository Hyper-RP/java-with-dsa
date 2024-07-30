package basic;
//discount calculator
import java.util.Scanner;

public class main20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("The price of the Product :");
        int product=input.nextInt();
        System.out.println("The discount of the product :");
        int discount=input.nextInt();
        int price=product-((discount*100)/product);
        System.out.println(price + " is a total price after "+discount+"%"+" of discount");
    }
}
