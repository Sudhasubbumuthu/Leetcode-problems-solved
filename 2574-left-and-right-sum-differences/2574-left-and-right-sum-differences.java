class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left = 0, right = 0;
        for(int i : nums) right += i;
        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            right = right - nums[i];
            nums[i] = Math.abs(left - right);
            left += a;
        }
        return nums;
    }
}