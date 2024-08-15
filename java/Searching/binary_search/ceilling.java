package Searching.binary_search;

public class ceilling {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18};
        int target=15;
        int res=isCeilling(arr,target);
        System.out.println(res);
    }
    static int isCeilling(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>start){
                end=mid-1;
            }
        }
        return start;
    }
}
