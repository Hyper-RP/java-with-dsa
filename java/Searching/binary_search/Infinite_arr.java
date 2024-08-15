package Searching.binary_search;
//find the element in the infinite array
public class Infinite_arr {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,8,9,10,11,12,13,14,15,16,17};
        int target=7;
        int res =mainAns(arr,target);
        System.out.println(res);
    }
//finding range to find element
    static int mainAns(int []arr,int target){
        int start=0;
        int end=1;
        int mid=0;
        while (target > end) {
            int Nstart=end+1;
            end=end+(end-start+1)*2;
            start=Nstart;
        }
        return isCheck(arr,target,start,end,mid);
    }

    //finding element
    static int isCheck(int []arr,int target,int start,int end,int mid){

        while (start<=end){
            mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            } else if (arr[mid]==target) {
                return arr[mid];
            }
        }
        return -1;
    }
}
