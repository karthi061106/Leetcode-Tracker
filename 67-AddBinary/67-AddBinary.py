# Last updated: 8/22/2026, 4:13:56 PM
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        m = len(a) - 1
        n = len(b) - 1
        ans = ""
        carry = 0
        while m >= 0 or n >= 0 or carry:
            char_a = a[m] if m >= 0 else "0"
            char_b = b[n] if n >= 0 else "0"
            if char_a == "1" and char_b == "1":
                if carry:
                    ans += "1"
                else:
                    ans += "0"
                carry = 1
            elif (char_a == "1" and char_b == "0") or (char_a == "0" and char_b == "1"):
                if carry:
                    ans += "0"
                    carry = 1
                else:
                    ans += "1"
                    carry = 0
            else:
                if carry:
                    ans += "1"
                else:
                    ans += "0"
                carry = 0
            m -= 1
            n -= 1
        return ans[::-1]