/*
1512. Number of Good Pairs
 */

public class Good_pairs {
    public static void main(String[] args) {
        int n[]={1,2,3,1,1,3};
        int res=numIdenticalPairs(n);
        System.out.println(res);
    }
    public static int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(nums[i]==nums[j]&&i<j){
                    count++;
                }
            }
        }
        return count;
    }
}
