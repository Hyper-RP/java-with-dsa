

public class ReverseNum {
    public static void main(String[] args) {
        int res=solve(123);
        System.out.println(res);
    }

    public static int solve(int num){
        int temp=num > 0 ?num:num*-1;
        long ans=0;
        while(temp>0){
            int mod=temp%10;
            ans=(ans*10)+mod;
            if(ans>Integer.MAX_VALUE){
                return 0;
            }
            temp=temp/10;
        }
        if(num<0){
            return (int)ans*-1;
        }
        return (int)ans;
    }
}
