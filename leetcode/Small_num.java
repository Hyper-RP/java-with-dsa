/*
1365. How Many Numbers Are Smaller Than the Current Number
 */

import java.util.Arrays;

public class Small_num {
    public static void main(String[] args) {
        int n[]={6,5,4,8};
        int res[]=smallerNumbersThanCurrent(n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int temp[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
            int j=0;
            while (j<n) {
                if(nums[i]>nums[j]){
                    count++;
                }
                j++;
            }
            temp[i]=count;
        }
        return temp;
    }
}
