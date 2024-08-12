

public class Perfect_sq {
    public static void main(String[] args) {
       boolean res= isPerfectSquare(5);
        System.out.println(res);
    }
    public static boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid>num/mid){
                end=mid-1;
            }
            else if(mid<num/mid){
                start=mid+1;
            }
            else if(mid*mid==num){
                return true;
            }
            else {
                break;
            }
        }
        return false;
    }
}
