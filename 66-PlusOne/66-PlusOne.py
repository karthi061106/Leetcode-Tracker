# Last updated: 8/22/2026, 4:13:58 PM
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        if digits[-1]!=9:
            digits[-1]+=1
        else:
            carry=1
            for i in range(len(digits)-1,-1,-1):
                if digits[i]==9:
                    digits[i]=(digits[i]+carry)%10
                    carry=1
                else:
                    digits[i]+=carry
                    carry=0
                    break
            if carry==1:
                digits.insert(0,1)
        return digits