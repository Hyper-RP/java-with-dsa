package basic;

import java.util.Scanner;

//increasing and decreasing
public class main39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num 1 : ");
        int num1 = input.nextInt();
        System.out.println("enter a num 2 : ");
        int num2 = input.nextInt();
        System.out.println("enter a num 3 : ");
        int num3 = input.nextInt();

        for (int k = 0; 0 < num1; k++) {
            for (int i = 0; 0 <= num1 && num1 <= num2 && num2 <= num3; i++) {
                System.out.println(num1 + " " + num2 + " " + num3 + " is increasing");
                break;
            }
            for (int j = 0; 0 < num1 && num1 >= num2 && num2 >= num3; j++) {
                System.out.println(num1 + " " + num2 + " " + num3 + " is decreasing ");
                break;
            }
            System.out.println(num1 + " " + num2 + " " + num3+" Neither");
            break;
        }
    }
}
