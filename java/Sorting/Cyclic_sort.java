package Sorting;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int []arr={5,1,4,2,1};
       int res[]= isCyclic(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[]  isCyclic(int []arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=arr.length&&arr[i]>0) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        return arr;
    }

}
