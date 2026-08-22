# Last updated: 8/22/2026, 4:06:59 PM
class Solution:
    def nearestDrone(self, drones: list[list[int]], target: list[int]) -> int:
        tx,ty=target
        min_dist=float('inf')
        ans=-1
        for i, (x,y,r) in enumerate(drones):
            dist =abs(x-tx)+abs(y-ty)
            if dist <=r and dist < min_dist:
                min_dist=dist
                ans=i
        return ans
        