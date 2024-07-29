//Given an array of integers nums and an integer target, 
//return indices of the two numbers such that they add up to target.
//You can return the answer in any order.

//you have to use main function and pass the value to twoSum function 

class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                 arr[0]=i;
                 arr[1]=j;
                 return arr;
                }
            }
           
            // break;
        }  return arr;
    }
}