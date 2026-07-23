class Solution {
    public int maxProfit(int[] prices) {
       int maxp=0,bestb=prices[0];
       for(int i=1;i<prices.length;i++){
        if(prices[i]>bestb){
            maxp=Math.max(maxp,prices[i]-bestb);
        }
        bestb=Math.min(bestb,prices[i]);

       }
       return maxp;

    }
}