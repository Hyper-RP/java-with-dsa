/*1672. Richest Customer Wealth
* */

public class Richest_customer_wealth {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},
                {3,2,1}};
        int res=maximumWealth(arr);
        System.out.println(res);
    }
        public static int maximumWealth(int[][] accounts) {
            int n=accounts.length;
            int wealth=0;
            int max=0;
            for(int i=0;i<n;i++){
                wealth=0;
                for(int j=0;j<accounts[i].length;j++){
                    wealth=wealth+accounts[i][j];
                }
                if(max<wealth){
                    max=wealth;
                }
            }
            return max;
        }
    }

