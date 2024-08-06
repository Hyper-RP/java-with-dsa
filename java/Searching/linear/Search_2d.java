package Searching.linear;

import java.util.Arrays;

//searching element in 2d dimensional array
public class Search_2d {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3,4},
                {5,6},
                {7,8,9,10}
        };
        int []res=ischeck(arr);
        System.out.println(Arrays.toString(res));
    }
    static int []ischeck(int [][]arr){
        int element=6;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(element==arr[i][j]){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
