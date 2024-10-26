package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode 448
//find missing number from their indices
public class FIndAllMissing {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> res = findDisappearedNumbers(arr);
        System.out.println(res);
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        isSwap(arr);
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (j + 1 != arr[j]) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    public static void isSwap(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; ) {
            temp = arr[i];
            if (arr[i] <= arr.length && arr[i] > 0 && arr[i] != arr[temp - 1]) {
                temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }
        }
    }
}
