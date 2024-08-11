//leetcode  278
public class Good_version {
    public static void main(String[] args) {
        int n=10;
        int res=firstBadVersion(n);
        System.out.println(res);
    }

    static boolean isBadVersion(int mid){
        int bad=5;
        if(mid>=5){
            return true;
        } else if (mid<5) {
            return false;
        }
        return false;
    }

    static int firstBadVersion(int n) {
        int start=1;
        int mid=0;
        int end=n;
        if(n==1)return n;
        while(start<=end){
            mid=start+(end-start)/2;
            if(isBadVersion(mid)==true&&isBadVersion(mid-1)==false){
                return mid;
            }
            else if(isBadVersion(mid)==false){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return mid;
    }
}

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

