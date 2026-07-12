# Last updated: 7/12/2026, 9:11:06 AM
1class Solution:
2    def minimumCost(self, nums: list[int], k: int) -> int:
3        mod=10**9+7
4        r=k
5        o=0
6        a=0
7        for x in nums:
8            if r<x:
9                n=(x-r+k-1)//k
10                a+=(o+1+o+n)*n//2
11                a%=mod
12                o+=n
13                r+=n*k
14            r-=x
15        return a%mod