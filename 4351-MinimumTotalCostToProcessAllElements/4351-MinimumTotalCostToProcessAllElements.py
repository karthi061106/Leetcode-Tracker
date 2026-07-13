# Last updated: 7/13/2026, 12:23:18 PM
class Solution:
    def minimumCost(self, nums: list[int], k: int) -> int:
        mod=10**9+7
        r=k
        o=0
        a=0
        for x in nums:
            if r<x:
                n=(x-r+k-1)//k
                a+=(o+1+o+n)*n//2
                a%=mod
                o+=n
                r+=n*k
            r-=x
        return a%mod