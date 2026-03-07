class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String s2 = s + s;

        int diff1 = 0; // for pattern 010101
        int diff2 = 0; // for pattern 101010
        int ans = Integer.MAX_VALUE;

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            char expected1 = (right % 2 == 0) ? '0' : '1';
            char expected2 = (right % 2 == 0) ? '1' : '0';

            if (s2.charAt(right) != expected1) diff1++;
            if (s2.charAt(right) != expected2) diff2++;

            if (right - left + 1 > n) {

                char exp1 = (left % 2 == 0) ? '0' : '1';
                char exp2 = (left % 2 == 0) ? '1' : '0';

                if (s2.charAt(left) != exp1) diff1--;
                if (s2.charAt(left) != exp2) diff2--;

                left++;
            }

            if (right - left + 1 == n) {
                ans = Math.min(ans, Math.min(diff1, diff2));
            }
        }

        return ans;
    }
}