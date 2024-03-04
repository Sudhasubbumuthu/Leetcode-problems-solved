class Solution {
    public int findMiddleIndex(int[] nums) {
        int pre = 0, s = 0, bal = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        System.out.print(s);
        for (int i = 0; i < nums.length; i++) {
            bal = s - nums[i] - pre;
            if (pre == bal) {
                return i;
            }
            pre += nums[i];
        }
        return -1;
    }
}