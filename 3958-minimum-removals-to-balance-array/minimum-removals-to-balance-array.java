class Solution {
    public int minRemoval(int[] nums, int k) {
       int n = nums.length;

        Arrays.sort(nums);

        int L = 1;
        int maxEl = nums[0];
        int minEl = nums[0];
        int i = 0;
        int j = 0;

        while (j < n) {
            minEl = nums[i];
            maxEl = nums[j];

            while (i < j && maxEl > (long) k * minEl) {
                i++;
                minEl = nums[i];
            }

            L = Math.max(L, j - i + 1);
            j++;
        }

        return n - L;
    }
}