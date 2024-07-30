/*
1389. Create Target Array in the Given Order
 */

import java.util.Arrays;

public class Target_array {
    public static void main(String[] args) {
        int n[]={0,1,2,3,4};
        int i[]={0,1,2,2,1};
        int res[]=createTargetArray(n,i);//[0,4,1,3,2]
        System.out.println(Arrays.toString(res));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int target[]=new int[n];
        for(int i=0;i<n;i++){
            target[i]=nums[index[i]];
        }
        return target;
    }
}
