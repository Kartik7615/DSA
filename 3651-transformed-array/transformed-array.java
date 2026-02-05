class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i = 0;  i < n; i++){
            if(nums[i] == 0){
                result[i] = 0;
            } else {
            int count = (i + nums[i]) % n;

            if(count < 0){
                count += n;
            }
            result[i] = nums[count];
        }
        }
        return result;
    }
}