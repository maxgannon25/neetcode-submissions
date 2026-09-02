class Solution {
    public int maxProfit(int[] prices) {

        int l=0;

        int maxProfit = 0;

        for (int r=1; r < prices.length; r++){
            int sum = prices[r] - prices[l];

            maxProfit = Math.max(sum, maxProfit);

            if (prices[l] >= prices[r]){
                l = r;
            }
        }

        return maxProfit;
        
        
    }
}
