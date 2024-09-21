package Sorting;

import java.util.Arrays;
//write a simple program for selection sort
public class Selection_sort {
    public static void main(String[] args) {
        int []arr={4,5,1,2,3};
        int []res=isCheck(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] isCheck(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max=isMax(arr,0,arr.length-(i+1));
            int temp=arr[max];
            arr[max]=arr[arr.length-(i+1)];
            arr[arr.length-(i+1)]=temp;
        }
        return arr;
    }

    private static int isMax(int[] arr, int start, int end) {
        int max=arr[0];
        int index=0;;
        for ( int j = start; j < end; j++) {
            if(max<arr[j]){
                max=arr[j];
                index=j;
            }
        }
        return index;
    }


}

