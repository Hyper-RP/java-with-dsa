package basic;

import java.util.Arrays;

public class main3 {

    public static void main(String[] args) {
        int[] arr = {3,5,0,0,4};
        int[] res = result(arr);
        System.out.println(Arrays.toString(res));
    }


    public static int[] result(int[] arr) {
        int len = arr.length;
        int index=0;
        for (int i = 0; i < len ; i++) {

            if(arr[i]!=0){
                swap(arr,i,index);
                index++;
            }

        }
        return arr;
    }

    public static void swap(int[] arr, int firstIndex, int secondIndex) {

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;

    }
}