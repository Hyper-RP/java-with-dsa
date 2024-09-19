package Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int []arr={3,2,5,4,1};
        int []res=isCheck(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] isCheck(int []arr) {
        int i=0;

        while (i<arr.length-1){
            for (int j = 0; j < arr.length - (i+1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        i++;
    }
        return arr;
    }
}
