class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = 0;
        for(int i = 0; i < n; i++){
            ans[j] = nums[i];
            ans[++j] = nums[i+n];
            j++; 
        }
        return ans;
    }
}