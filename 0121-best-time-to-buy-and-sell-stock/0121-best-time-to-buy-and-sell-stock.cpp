class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mxp=0,bestbuy=prices[0];
for(int i=0;i<prices.size();i++){
    if(prices[i]>bestbuy){
        mxp=max(mxp,prices[i]-bestbuy);
    }
    bestbuy=min(bestbuy,prices[i]);
}
return mxp;

    }
};