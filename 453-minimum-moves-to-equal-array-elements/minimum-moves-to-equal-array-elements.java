class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int minNum = nums[0];
        int diff = 0;

        for(int i = 1; i < nums.length; i++){
            diff += nums[i] - minNum;
        }
        return diff;
    }
}