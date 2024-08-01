//121. Best Time to Buy and Sell Stock

public class Buy_sell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println("the maximum profit is : "+maxProfit(arr));
    }
        public static int  maxProfit(int[] prices) {
            int n=prices.length;
            int max=0;
            int min=prices[0];
            for(int i=1;i<n;i++){
                if(min>prices[i]){
                    min=prices[i];
                }
                max=Math.max(max,prices[i]-min);
            }
            return max;
        }
}

