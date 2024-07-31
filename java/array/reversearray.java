package array;

import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []marks={5,8,6,9,4};
        int temp[]=new int [5];
        int i=0;
        for (int j = marks.length-1; j >=0 ; j--) {
            temp[i]=marks[j];
            i++;
        }

        System.out.println(Arrays.toString(temp));

    }
}
