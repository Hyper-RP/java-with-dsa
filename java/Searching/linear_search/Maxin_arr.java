package Searching.linear_search;
//find max element in array.
public class Maxin_arr {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int res=ischeck(arr);
        System.out.println(res);
    }
    static int ischeck(int []arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
