class Solution {
    public int maxProfit(int[] prices) {
        //tc:O(n) sc:O(1)
        int min = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }
}

/*Brute - O(n^2) take one and compare with all*/ 