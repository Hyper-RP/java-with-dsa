import java.util.Arrays;

//package java;
//238. Product of Array Except Self
public class productArr {
    public static void main(String[] args) {
        int[] nums={-1,1,0,-3,3};
        int[] ans= solve(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[] arr){
        int len=arr.length;
        int[] prefixArr=new int[len];
        prefixArr[0]=1;
        int[] suffixArr=new int[len];
        suffixArr[len-1]=1;
        int[] ans=new int[len];
        for(int i=1;i<len;i++){
            prefixArr[i]=prefixArr[i-1]*arr[i-1];
        }


        for(int j=len-2;j>=0;j--){
            suffixArr[j]=suffixArr[j+1]*arr[j+1];

        }


        for(int k=0;k<arr.length;k++){
            ans[k]=prefixArr[k]*suffixArr[k];
        }

        return ans;
    }
}
