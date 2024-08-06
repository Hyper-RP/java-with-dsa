package Searching.linear;

import java.util.Arrays;

//find max element in 2d array and return the index.
public class Maxin_2d {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3,4},
                {15,6},
                {7,8,9,10}
        };
        int []res=ischeck(arr);
        System.out.println(Arrays.toString(res));
    }
    static int []ischeck(int [][]arr){
        int max=arr[0][0];
        int []temp={0,0};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                    temp=new int[]{i,j};
                }
            }
        }
        return temp;
    }
}
