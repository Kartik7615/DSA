class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> mpp = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(mpp.contains(nums[i])){
                return true;
            }
            mpp.add(nums[i]);

            if(mpp.size() > k){
                mpp.remove(nums[i - k]);
            }
        }
        return false;
    }
}