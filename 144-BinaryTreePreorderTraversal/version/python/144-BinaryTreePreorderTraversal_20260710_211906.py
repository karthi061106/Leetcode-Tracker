# Last updated: 7/10/2026, 9:19:06 PM
1class Solution:
2    def addBinary(self, a: str, b: str) -> str:
3        m = len(a) - 1
4        n = len(b) - 1
5        ans = ""
6        carry = 0
7        while m >= 0 or n >= 0 or carry:
8            char_a = a[m] if m >= 0 else "0"
9            char_b = b[n] if n >= 0 else "0"
10            if char_a == "1" and char_b == "1":
11                if carry:
12                    ans += "1"
13                else:
14                    ans += "0"
15                carry = 1
16            elif (char_a == "1" and char_b == "0") or (char_a == "0" and char_b == "1"):
17                if carry:
18                    ans += "0"
19                    carry = 1
20                else:
21                    ans += "1"
22                    carry = 0
23            else:
24                if carry:
25                    ans += "1"
26                else:
27                    ans += "0"
28                carry = 0
29            m -= 1
30            n -= 1
31        return ans[::-1]