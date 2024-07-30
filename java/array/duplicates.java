package java.array;

import java.util.Arrays;
import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [][]arr=new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length  ; col++) {
                arr[row][col]=input.nextInt();
            }
        }
        for (int []num:arr){
            System.out.println(Arrays.toString(num));
        }

    }
}
