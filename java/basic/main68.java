package basic;

import java.util.Arrays;

public class main68 {
    public static void main(String[] args) {
        int k=8;
        int arr[]={1,2,3,4,5,6,7};
        rotateArr(arr,k);
    }

    public static void rotateArr(int[] arr,int k){
        int[] tempArr=new int[arr.length];
        if(k> arr.length){
            k=k- arr.length;
        }
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(k+i<arr.length) {
                tempArr[i] = arr[k + i];
            }
            else if(index<=k){
                tempArr[arr.length-(index+1)] = arr[k-(index+1)];
                index++;
            }
        }
        System.out.println("temp arr : "+ Arrays.toString(tempArr));
    }
}
