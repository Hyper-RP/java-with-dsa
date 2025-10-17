package basic;

public class main73 {
    public static void main(String[] args) {
        int ans= myFun(5);
        System.out.println(ans);
    }

    public static int myFun(int n){
        if(n==0) return 1;
        int ans=myFun(n-1);
        int res=n+ans;
        return res;
    }
}
