# Last updated: 8/9/2026, 9:13:13 AM
1class Solution:
2    def minPrice(self, prices: list[int], discounts: list[int]) -> float:
3        prices.sort(reverse=True)
4        discounts.sort(reverse=True)
5        total =0
6        n=min(len(prices),len(discounts))
7        for i in range(n):
8            total+=prices[i]*(100-discounts[i])/100
9        for i in range(n,len(prices)):
10            total+=prices[i]
11        return total
12        