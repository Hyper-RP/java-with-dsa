import java.util.Arrays;
//238. Product of Array Except Self
public class product_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int res[]=productExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }

        public static int [] productExceptSelf(int[] nums) {
            int len=nums.length;
            int answer[]=new int[len];
            int left[]=new int[len];
            int right[]=new int[len];
            for(int i=1;i<len;i++){
                left[0]=1;
                left[i]=left[i-1]*nums[i-1];
            }
            for(int i=len-2;i>-1;i--){
                right[len-1]=1;
                right[i]=right[i+1]*nums[i+1];
            }
            for(int i=0;i<len;i++){
                answer[i]=right[i]*left[i];
            }
            return answer;
        }
    }
