class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, tot = 0;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < nums.length; i++)
            tot += nums[i];
        return sum-tot;
    }
}