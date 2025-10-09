//package java;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> list=solve1(nums);
        System.out.println(list);
    }
    public static List<List<Integer>> solve1(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();
        int first = 0;

        while (first < arr.length - 2) {
            int start = first + 1;
            int end = arr.length - 1;
            while (start < end) {
                int sum = arr[first] + arr[start] + arr[end];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>(Arrays.asList(arr[first], arr[start], arr[end]));
                    Collections.sort(list);
                    res.add(list);
                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
            first++;
        }
        List<List<Integer>> ans = new ArrayList<>(res);

        return ans;
    }
}
