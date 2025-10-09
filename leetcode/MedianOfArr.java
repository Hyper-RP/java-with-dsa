//package java;

import java.util.Arrays;

public class MedianOfArr {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        double res=solve(nums1,nums2);
    }

    public static double solve(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i];
        }

        int len = arr1.length;
        for (int j = 0; j < arr2.length; j++) {
            temp[len] = arr2[j];
            len++;
        }

        Arrays.sort(temp);

        if (temp.length % 2 == 0) {
            double num1 = (double) temp[temp.length / 2];
            double num2 = (double) temp[(temp.length / 2) - 1];
            double res = (num1 + num2) / 2;
            return res;
        } else {
            int num = temp[temp.length / 2];
            return (double) num;
        }
        // return 0;
    }
}
