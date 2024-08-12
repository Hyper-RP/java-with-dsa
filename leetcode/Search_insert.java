//leetcode 35
public class Search_insert {
    public static void main(String[] args) {
        int []nums={1,3,5,6};
        int target=5;
        int res=searchInsert(nums,target);
        System.out.println(res);
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
        }
        return start;
    }
}
