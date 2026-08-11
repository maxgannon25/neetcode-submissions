class Solution {
    public int maxProfit(int[] prices) {

        int left = 0;
        int right = 1;

        int best = 0;
        while (right < prices.length){
            int diff = prices[right] - prices[left];
            if (diff > best){
                best = diff;
            }
            
            if (prices[right] < prices[left]){
                left = right;
            }
            right = right + 1;
        }
        return best;
    }
}
