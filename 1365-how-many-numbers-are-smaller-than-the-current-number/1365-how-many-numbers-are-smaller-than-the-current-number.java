class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> m = new ArrayList<>();
        for(int i : nums){
            m.add(i);
        }
        Collections.sort(m);
        int[] ans = new int[nums.length];
        int i = 0;
        for(int a : nums){
            ans[i++] = m.indexOf(a);
        }
        return ans;
    }
}