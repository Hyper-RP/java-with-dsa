package basic;

import java.util.Arrays;

public class main59 {
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d=3;
        int []ans= rotateArr(arr,d);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] rotateArr(int arr[],int d){

        int temp1[]=arr.clone();
        int temp2[]=new int[arr.length];
        int i=0;
        int j=0;
        while(j<d){
            for ( i = 0; i <arr.length ; i++) {
                if(arr.length-2>=i) {
                    temp2[i] = temp1[i + 1];
                } else if (arr.length-1==i) {
                    int rotateElementIndex=arr.length-(i+1);
                    temp2[i]=temp1[rotateElementIndex];
                    temp1=temp2.clone();
                    j++;
                }
            }

        }

        return temp2;
    }
}

