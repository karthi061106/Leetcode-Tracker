# Last updated: 8/22/2026, 4:06:58 PM
class Solution:
    def elevatorRequests(self, n: int, requests: list[int]) -> int:
        current=0;
        total=0;
        for floor in requests:
            total+=abs(floor-current)
            current=floor
        return total
        