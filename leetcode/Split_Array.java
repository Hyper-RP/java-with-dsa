//leetcode 410 [hard]
public class Split_Array {
    public static void main(String[] args) {
        int []arr={7,2,5,8,10};
        int m=2;
        int res=splitArray(arr,m);
        System.out.println(res);
    }
    static int splitArray(int []arr,int m){
        int start=0;
        int end=0;
        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start,arr[i]);
            end=end+arr[i];
        }
        while (start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int j = 0; j < arr.length; j++) {
                if(sum+arr[j]>mid){
                    sum=arr[j];
                    pieces++;
                }
                else{
                    sum=sum+arr[j];
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return start;
    }
}
