//leetcode 441

public class Arrange_coins {
    public static void main(String[] args) {
    int res=arrangeCoins(5);
        System.out.println(res);
    }
    public static int arrangeCoins(int n) {
        long start=1;
        long end=n;
        long mid=0;
        long sum=0;
        while(start<=end){
            mid=start+(end-start)/2;
            sum=mid*(mid+1)/2;
            if(sum>n){
                end=mid-1;
            }
            else if(sum<n){
                start=mid+1;
            }
            else if(sum==n){
                return (int)mid;
            }
            else{
                break;
            }
        }
        return (int)end;
    }
}
