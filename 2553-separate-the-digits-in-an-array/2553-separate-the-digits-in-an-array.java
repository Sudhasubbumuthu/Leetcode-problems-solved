class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int l = (int) Math.log10(nums[i]) + 1;
            int n = nums[i];
            while (l > 0) {
                ans.add(n / (int) Math.pow(10, l - 1));
                n = n % (int) Math.pow(10, l - 1);
                l--;
            }
        }
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}