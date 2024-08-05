//1295. Find Numbers with Even Number of Digits
public class Even_no_digits {
    public static void main(String[] args) {
        int []arr={12,345,2,6,7896};
        int res=findNumbers(arr);
        System.out.println(res);
    }

        public static int findNumbers(int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                int digit=(int)Math.log10(nums[i])+1;
                if(digit%2==0){
                    count++;
                }
            }
            return count;
        }
}
