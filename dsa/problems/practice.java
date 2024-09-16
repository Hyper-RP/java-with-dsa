import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int []arr={1,2,3,5,8,0,7,9,0};
        int res=check(arr);
        System.out.println(res);
    }

    public static int check(int []arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<end){
            mid=start+(end-start)/2;
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
                start=start+1;
                end=end-1;
            }
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            if(arr[start]>arr[start+1]){
                return arr[start];
            }
            if (arr[start]<arr[end]||arr[start]==arr[end]){
                return arr[end];
            }
            if (arr[start]>arr[mid]){
                end=mid;
            }
            else {
                start=mid;
            }
        }
        return mid;
    }
}

