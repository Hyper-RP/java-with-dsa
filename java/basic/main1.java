package basic;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = input.nextInt();
        System.out.println("enter num2");
        int num2 = input.nextInt();
        System.out.println("1.+  2.- 3./  4.*");
        int operator = input.nextInt();

        if (operator == 1) {
            int sum = num1 + num2;
            System.out.println("your sum is " + sum);
        }
        if (operator == 2) {
            int sub = num1 - num2;
            System.out.println("your minus is " + sub);
        }
        if (operator == 3) {
            int div = num1 / num2;
            System.out.println("your sum is " + div);
        }
        if (operator == 4) {
            int mul = num1 * num2;
            System.out.println("your sum is " + mul);
        }
    }
}
