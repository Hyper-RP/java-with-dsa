//leetcode 33
public class Search_sortted {
    public static void main(String[] args) {
        int arr[]={1,3};
        int target=0;
        int res=search(arr,target);
        System.out.println(res);
    }

    public static int search(int[] nums, int target) {
        int pivot=pivotElement(nums,target);
       if(pivot!=-1){
           if(nums[pivot]==target){
               return pivot;
           }
           else if(target>nums[0]){
               return RBS(nums,0,pivot,target);
           }
           else if(target<nums[0]){
               return RBS(nums,pivot+1,nums.length-1,target);
           }
       }
        else {
           return RBS(nums, 0, nums.length - 1, target);
       }
        return -1;
    }

    //simple binary search
    public static int RBS(int []nums,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=start+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    //finding pivot element
    public static int pivotElement(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[0]==target||nums.length==1){
                return 0;
            }
            if(mid>start&&nums[mid]<nums[mid-1]){
                return mid;
            }
            if(mid<end&&nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[start]){
                end=mid-1;
            }
           if(nums[mid]>nums[start]){
                end=mid-1;
            }
            else {
                start=start+1;
            }
        }
        return -1;
    }
}
