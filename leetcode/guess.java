//guess the number
//leetcode 374
public class guess {
    public static void main(String[] args) {
        int n=10;
        int res=guessNumber(n);
        System.out.println(res);
    }
    static int guess(int n){
        int pick=2;
        if(n<pick){
            return 1;
        }
        else if(n>pick){
            return -1;
        }
        else if(n==pick){
            return 0;
        }
        return -1;
    }
    static int guessNumber(int n) {
        int start=1;
        int mid=0;
        int end=n;
        int ans=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(guess(mid)==1){
                start=mid+1;
            }
            else if(guess(mid)==-1){
                end=mid-1;
            }
            else if(guess(mid)==0){
                ans=mid;
                break;
            }
        }
        return ans;
    }

}
