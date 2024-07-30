package basic;

import java.util.Scanner;
/*
* code to find armstrong number
* take limits from the user
*/

public class main9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a limit : ");
        int limit = input.nextInt();
        int originalLim = limit;
        int original = limit;
        int digit = 0;
        int remainder;
        int result;
        int sum = 0;
        int modulo;
        int plus;

        for (int k = 0; originalLim > 0; k++) {
            for (int i = 0; originalLim > 0; i++) {
                for (int j = 0; original > 0; j++) {
                    original = original / 10;
                    digit++;
                }
                remainder = originalLim;
                modulo = remainder % 10;
                result = (int) (Math.pow(modulo, digit));
                originalLim = originalLim / 10;
                sum = sum + result;

            }
            limit = limit - 1;
            originalLim=limit;
            original=limit;
            digit=0;
            plus=sum;
            sum=0;
//            System.out.println("total no of digits : "+digit);
            if (originalLim==plus-1) {
                System.out.println(limit+1 +" is a armstrong number ");
            }
        }
        }
    }









