import java.util.Arrays;

//leetcode 268
//finding missing number from 0 to n.
public class Find_missing {
    public static void main(String[] args) {
        int []arr={3,1,3,4,2};
        System.out.println(isCheck(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int isCheck(int []arr){
        isSwap(arr);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j)
            {
                return j;
            }
        }
        return arr.length;
    }
    public static void isSwap(int []arr){
        int temp=0;
        for (int i = 0; i < arr.length;) {
            temp=arr[i];

            if(arr[i]!=i&&arr[i]<=arr.length&&arr[i]!=arr[temp]){
                temp=arr[i];
                arr[i]=arr[temp];
                arr[temp]=temp;
            }
            else {
                i++;
            }
        }
    }
}
