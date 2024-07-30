package basic;

import java.util.Scanner;

//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
// then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//Example 1:
//Input: x = 123
//Output: 321
//Example 2:
//Input: x = -123
//Output: -321
//Example 3:
//Input: x = 120
//Output: 21
//Constraints:
//-231 <= x <= 231 - 1
public class main50 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        palindrome(num);
    }
    static void palindrome(int n) {
        int modulo = n;
        int temp = 0;
        long rem = 0;
        double min = Math.pow(-2, 31);
        double max = Math.pow(2, 31);
        for (int i = 0; 0 < modulo || 0 > modulo; i++) {
            temp = modulo % 10;
            rem = (rem * 10) + temp;
            modulo = modulo / 10;
        }
        System.out.println(rem);
        if (rem > max) {
            rem=0;
        }
//        return (int) rem;
    }
}
