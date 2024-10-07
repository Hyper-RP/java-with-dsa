package Sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int []arr={};
        isSwap(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void isSwap(int[] arr) {
        int i=0;
        while(i<arr.length-1){
            isMove(arr,i);
            i++;
        }
    }

    public static void isMove(int[] arr,int i) {
        for (int j = i+1; j > 0; j--) {
            if(arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
            else{
                break;
            }
        }

    }
}
