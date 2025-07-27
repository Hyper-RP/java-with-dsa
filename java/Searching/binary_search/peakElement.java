package Searching.binary_search;
//find peak element : where the previous and next element is smaller (middle)
public class peakElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,5,7,8};
        boolean res= findPeakElement(arr);
        System.out.println(res?"":"no peak element found");
    }
    public static boolean findPeakElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                System.out.println("peak element is : "+arr[mid]);
                return true;
            }
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
                start=mid+1;
            } else if (arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]) {
                end=mid;
            }
            else {
                break;
            }

        }
        return false;
    }
}
