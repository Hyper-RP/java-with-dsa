package inbuild_function;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int []arr={4,5,6};
        int first=0;
        int second=arr.length-1;
        int []res=isSwap(arr,first,second);
        System.out.println(Arrays.toString(res));
    }
    public static int []isSwap(int []arr,int first,int second){
        {
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
        return arr;
    }
}
