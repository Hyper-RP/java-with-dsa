//1679. Max Number of K-Sum Pairs

import java.util.Arrays;

public class kSumPairs {
    public static void main(String[] args) {
    int[] arr={4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
    int k=2;
    int res=solve(arr,k);
    System.out.println(res);
    }
    public static int solve(int[] arr,int k){
        Arrays.sort(arr);
        int right=arr.length-1;
        int left=0;
        int count=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==k){
                count++;
                left++;
                right--;
            }
            else if(sum>k){
                right--;
            }
            else{
                left++;
            }
        }
        return count;
    }
}
