

public class Max_subarray_product {
    public static void main(String[] args) {
        int []arr={2,3,-2,4};
        int result=maxProduct(arr);
        System.out.println(result);
    }
    public static int maxProduct(int[] nums) {
        int n=nums.length;
        int res=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            res=res*nums[i];
            if(res>max){
                max=res;
            }
        }
        return max;
    }
}
