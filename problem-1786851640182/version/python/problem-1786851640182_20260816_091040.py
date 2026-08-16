# Last updated: 8/16/2026, 9:10:40 AM
1class Solution:
2    def nearestDrone(self, drones: list[list[int]], target: list[int]) -> int:
3        tx,ty=target
4        min_dist=float('inf')
5        ans=-1
6        for i, (x,y,r) in enumerate(drones):
7            dist =abs(x-tx)+abs(y-ty)
8            if dist <=r and dist < min_dist:
9                min_dist=dist
10                ans=i
11        return ans
12        