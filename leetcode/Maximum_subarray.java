/*
53.maximum subarray without kadane algorithm
 */

public class Maximum_subarray {
    public static void main(String[] args) {
        int []arr={2,-5,7,8};
        int res=maxSubArray(arr);
        System.out.println(res);
    }

        public static int maxSubArray(int[] nums) {
            int len=nums.length;
            int sum=0;
            int max_sum=Integer.MIN_VALUE;
            for(int i=0;i<len;i++){
                sum=sum+nums[i];
                if(sum>max_sum){
                    max_sum=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
            return max_sum;
        }
    }

