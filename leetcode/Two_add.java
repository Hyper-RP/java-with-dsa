//leetcode 167

import java.util.Arrays;

public class Two_add {
    public static void main(String[] args) {
        int []numbers={2,7,11,15};
        int target=9;
        int []res =twoSum(numbers,target);
        System.out.println(Arrays.toString(res));
    }

        public static int[] twoSum(int[] numbers, int target) {
            int start=0;
            int []ans=new int[2];
            int end=numbers.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(numbers[start]+numbers[end]==target){
                    ans=new int []{start+1,end+1};
                    return ans;
                }
                else if(numbers[start]+numbers[end]>target){
                    end=end-1;
                }
                else if(numbers[start]+numbers[end]<target){
                    start=start+1;
                }
            }
            return new int[0];
        }
    }

