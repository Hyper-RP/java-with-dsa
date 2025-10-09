

import java.util.Arrays;
import java.util.Comparator;

public class TwoSumOptimal {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = solve(nums, target);
        System.out.println(Arrays.toString(res));
    }


    public static int[] solve(int[] arr, int target) {
        int n = arr.length;
        int[][] multiArr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            multiArr[i][0] = arr[i];
            multiArr[i][1] = i;
        }
        Arrays.sort(multiArr, Comparator.comparingInt(a -> a[0]));
        int start = 0;
        int next = arr.length - 1;


        while (start < next) {
            int sum = multiArr[start][0] + multiArr[next][0];
            if (sum == target) {
                return new int[]{multiArr[start][1], multiArr[next][1]};
            } else if (sum > target) {
                next--;
            } else {
                start++;
            }
        }
        return new int[]{0, 0};
    }
}




