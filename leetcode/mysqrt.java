//find a squre root of a number without using any inbuilt function with linear and binary search
//leetcode 69
public class mysqrt {
    public static void main(String[] args) {
        int x=8;
        int res =issqrt(x);
        System.out.println(res);
    }
    static int issqrt(int x){
        int start=1;
        int mid=0;
        int end=x;
        int ans=0;
        for(int i=start;start<=end;i++){
            mid=start+(end-start)/2;
            if(mid<=x/mid){
                start=mid+1;
                ans=mid;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
