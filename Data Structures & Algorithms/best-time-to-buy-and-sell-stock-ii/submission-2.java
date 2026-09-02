class Solution {
    public int maxProfit(int[] prices) {

        int l = 0;

        int maxProfit = 0;

        for (int r=1; r<prices.length; r++){

            int prof = prices[r] - prices[l];

            if (prof > 0){
                maxProfit += prof;
                l = r;
            }
            else{
                l = r;
            }

            // if (prices[r] < prices[l]){
            //     l = r;
            // }
        }

        return maxProfit;
    }
}