package basic;

public class main58 {
    public static void main(String[] args) {
        double res= ischeck(5);
        System.out.println(res);
    }
    static double ischeck(int num){
        double res=0;
        double start;
        double end =num;
        for ( start=1; start <= end;) {
             double mid = (start+end)/2;
                res=mid;
             if(start<end&&start!=mid) {
                 if (mid * mid == num) {
                     res = mid;
                     break;
                 } else if (end*end == num) {
                     res=end;
                     break;
                 } else if (mid * mid > num) {
                     end = mid;
                 } else if (mid * mid < num) {
                     start = mid;
                 }
             } else if (mid==start) {
                 if ((mid) * (mid) == num) {
                     res = mid;
                     break;
                 }
                 else{
                     mid=mid+0.1;
                     start=start+0.1;
                 }
             }
        }
        return res;
    }
}
