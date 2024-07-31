package array;

import java.util.Arrays;
//array swapping
public class Swap_arr {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
       swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []num){
        int temp=num[1];
        num[1]=num[3];
        num[3]=temp;
    }
}
