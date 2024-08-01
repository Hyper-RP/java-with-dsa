package array;

import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks[]={5,8,6,9,4,7};
        int j=0;
        int len=marks.length-1;
        rev(marks,j,len);
        System.out.println(Arrays.toString(marks));
    }
    static void rev(int []arr,int i,int n){
        while(i<n){
            swap(arr,i,n);
            i++;
            n--;
        }
    }
    static void swap(int []arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}