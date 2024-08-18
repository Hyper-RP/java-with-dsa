//leetcode 852

public class Mountain {
    public static void main(String[] args) {
        int []arr={1,2,3,1};
        int res=peak(arr);
        System.out.println(res);
    }
    static int peak(int []arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            //increasing order
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            //decreasing order
            else if(arr[mid]<arr[mid-1]){
                end=mid;
            }
            else {
                break;
            }
        }
        return arr[start];
    }
}
