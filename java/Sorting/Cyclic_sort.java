package Sorting;

public class Cyclic_sort {
    public static void main(String[] args) {
        int []arr={};
       int res= isCyclic(arr);
        System.out.println(res);
    }
    public static int  isCyclic(int []arr){
        isswap(arr);
        int j=0;
        for ( j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    public static void isswap(int []arr){
        for (int i = 0; i < arr.length; i++) {
           if(i>0&&arr[i]!=i) {
               int temp = arr[i];
               arr[i] = arr[temp - 1];
               arr[temp - 1] = temp;
           }
        }
    }
}
