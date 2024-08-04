

public class Max_Product_subarray {
    public static void main(String[] args) {
        int arr[]={0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int res=1;
            for (int j = i; j < n; j++) {
                res=res*arr[j];
                max=Math.max(max,res);
            }

        }
    }
}
