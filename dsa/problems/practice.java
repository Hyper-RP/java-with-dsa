import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int []arr={1,2,3,5,8,0,7,9,0};
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

