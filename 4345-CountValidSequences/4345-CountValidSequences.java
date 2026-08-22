// Last updated: 8/22/2026, 4:07:21 PM
class Solution {
    private static final int MOD = 1_000_000_007;

    public int countValidSequences(int n, int k) {
        if (n < k) return 0;

        long[] fact = new long[n + 1];
        long[] invFact = new long[n + 1];
        fact[0] = 1;
        invFact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        invFact[n] = modInverse(fact[n], MOD);
        for (int i = n - 1; i >= 1; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }

        // 1. Total sequences = C(n - 1, k - 1)
        long total = nCr(n - 1, k - 1, fact, invFact);

        // 2. Odd-only sequences
        long oddOnly = 0;
        if ((n - k) % 2 == 0) {
            int m = (n - k) / 2;
            oddOnly = nCr(m + k - 1, k - 1, fact, invFact);
        }

        // 3. Valid (Even product) = Total - OddOnly
        long ans = (total - oddOnly + MOD) % MOD;
        return (int) ans;
    }

    private long nCr(int n, int r, long[] fact, long[] invFact) {
        if (r < 0 || r > n) return 0;
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    private long modInverse(long base, int mod) {
        return power(base, mod - 2, mod);
    }

    private long power(long base, long exp, int mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }
}