//leetcode 34

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int []arr={5,7,7,8,8,10};
        int target=8;
        int []ans=res(arr,target);
        System.out.println(Arrays.toString(ans));
    }

     static int[] res(int[] arr, int target) {
        int ans[]={-1,-1};
        ans[0]=isCheck(arr,target,true);
        ans[1]=isCheck(arr,target,false);
        return ans;
    }

 static int isCheck(int[] arr, int target,boolean first) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        int temp=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                temp=mid;
                if (first){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return temp;
    }


}
