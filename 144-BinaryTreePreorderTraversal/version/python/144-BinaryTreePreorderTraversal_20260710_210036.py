# Last updated: 7/10/2026, 9:00:36 PM
1class Solution:
2    def plusOne(self, digits: List[int]) -> List[int]:
3        if digits[-1]!=9:
4            digits[-1]+=1
5        else:
6            carry=1
7            for i in range(len(digits)-1,-1,-1):
8                if digits[i]==9:
9                    digits[i]=(digits[i]+carry)%10
10                    carry=1
11                else:
12                    digits[i]+=carry
13                    carry=0
14                    break
15            if carry==1:
16                digits.insert(0,1)
17        return digits