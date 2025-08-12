//11. Container With Most Water

public class mostWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int res=solve(arr);
        System.out.println("max water in container : "+res);
    }
    public static int solve(int[] arr){
        int right=arr.length-1;
        int max=0;
        for(int left=0;left<right;){
            int space=right-left;
            int min=Math.min(arr[left],arr[right]);
            int area=min*space;
            if(max<area){
                max=area;
            }
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
