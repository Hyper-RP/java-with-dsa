package array;

import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks[]={5,8,6,9,4};
        int j=0;
        int len=marks.length;
        rev(marks,j,len);
        System.out.println(marks);


//        int []marks={5,8,6,9,4};
//        int temp[]=new int [5];
//        int i=0;
//        for (int j = marks.length-1; j >=0 ; j--) {
//            temp[i]=marks[j];
//            i++;
//        }

//        System.out.println(Arrays.toString(temp));

    }
    static void rev(int []arr,int n,int i){
        while(i<n-1){
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