package Sorting;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        int res[]= isCyclic(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[]  isCyclic(int []arr){
        int temp=0;
        for (int i = 0; i < arr.length;) {
            temp=arr[i];
            if(arr[i]<=arr.length&&arr[i]>0 &&arr[i]!=arr[temp-1]) {
                temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }

}