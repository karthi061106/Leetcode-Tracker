// Last updated: 8/10/2026, 12:10:48 AM
1class Solution {
2    // to store previously computed substrings
3    Map<String, Boolean> map = new HashMap<>();
4
5    public boolean isScramble(String s1, String s2) {
6        int n = s1.length();
7        // check if the two strings are equal
8        if (s1.equals(s2)) {
9            return true;
10        }
11        // initialize frequency arrays for s1, s2, and current substring
12        int[] a = new int[26], b = new int[26], c = new int[26];
13        // check if the current substring has already been computed
14        if (map.containsKey(s1 + s2)) {
15            return map.get(s1 + s2);
16        }
17        // check all possible splits of the two strings
18        for (int i = 1; i <= n - 1; i++) {
19            int j = n - i;
20            // update frequency arrays for s1, s2, and current substring
21            a[s1.charAt(i - 1) - 'a']++;
22            b[s2.charAt(i - 1) - 'a']++;
23            c[s2.charAt(j) - 'a']++;
24            // check if the current substring has the same characters
25            if (Arrays.equals(a, b) && isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i))) {
26                // if the substrings are scrambled versions of each other, return true
27                map.put(s1 + s2, true);
28                return true;
29            }
30            // check if the current substring and its complement have the same characters
31            if (Arrays.equals(a, c) && isScramble(s1.substring(0, i), s2.substring(j)) && isScramble(s1.substring(i), s2.substring(0, j))) {
32                // if the substrings are scrambled versions of each other, return true
33                map.put(s1 + s2, true);
34                return true;
35            }
36        }
37        // if none of the splits result in scrambled versions, return false
38        map.put(s1 + s2, false);
39        return false;
40    }
41}