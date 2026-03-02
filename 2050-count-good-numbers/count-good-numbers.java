class Solution {

    static final long M = 1000000007;

    long findPow(long a, long b) {
        if (b == 0) return 1;

        long half = findPow(a, b / 2);
        long result = (half * half) % M;

        if (b % 2 == 1) {
            result = (result * a) % M;
        }

        return result;
    }

    public int countGoodNumbers(long n) {

        long even = findPow(5, (n + 1) / 2);
        long odd  = findPow(4, n / 2);

        return (int)((even * odd) % M);
    }
}