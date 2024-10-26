package leetcode;
//leetcode 287 is added
//return duplicate element
import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int res = isCheck(arr);
        System.out.println((res));
    }

    public static int isCheck(int[] arr) {
        isSwap(arr);
        for (int j = 0; j < arr.length; j++) {
            if (arr[0] == arr[j]) {
                return arr[0];
            }
        }
        return arr[0];
    }
    public static void isSwap(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; ) {
            temp = arr[i];

            if (arr[i] != i && arr[i] <= arr.length && arr[i] != arr[temp]) {
                temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            } else {
                i++;
            }
        }

    }
}