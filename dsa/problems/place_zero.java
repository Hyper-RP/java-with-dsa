import java.util.Arrays;

public class place_zero {
    public static void main(String[] args) {
        int []arr={1,2,3,0,0,4,5};
        int []res=isSort(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] isSort(int []arr){
        Arrays.sort(arr);
        check(arr);
        return arr;
    }
    public static int[]check(int []arr){
        int start=0;
        int end=arr.length-1;
       while (start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        System.out.println(Arrays.toString(arr));
       return arr ;
    }
}
