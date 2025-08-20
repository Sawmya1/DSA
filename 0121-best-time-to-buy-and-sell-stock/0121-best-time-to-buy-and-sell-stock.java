class Solution {
    public int maxProfit(int[] prices) {
        int start=Integer.MAX_VALUE,last=0;
        for(int i=0;i<prices.length;i++){
            start = Math.min(start, prices[i]);
            last = Math.max(last, prices[i]-start);
        }
        return last;
    }
}