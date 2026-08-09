// Last updated: 8/10/2026, 12:03:53 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3    int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
4    for (int price : prices) {
5        prev_buy = buy;
6        buy = Math.max(prev_sell - price, prev_buy);
7        prev_sell = sell;
8        sell = Math.max(prev_buy + price, prev_sell);
9    }
10    return sell;
11}
12}