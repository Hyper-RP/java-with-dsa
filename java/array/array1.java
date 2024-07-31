package array;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2, 5, 1, 3, 4, 7};//2,3,5,4,1,7
        int target = 3;
        shuffle(arr, target);
    }
    public static int[] shuffle(int[] nums, int n) {
        int temp=n;
        int temparr[]=new int[2*n];
        int x[]=new int[n];
        int y[]=new int[n];
        int j=0;
        for (int i = 0; i <n; i++) {
            x[i]=nums[i];
            y[i]=nums[temp];
            temp++;//{2, 5, 1, 3, 4, 7};//2,3,5,4,1,7
            temparr[j]=x[i];
            temparr[j+1]=y[i];
            j=j+2;
        }
        return nums;
    }
}