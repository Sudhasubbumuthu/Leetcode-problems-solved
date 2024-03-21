class Solution {
    public boolean divideArray(int[] nums) {
        int r = nums.length/2;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        int s = 0;
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            s += e.getValue()/2;
        }
        return s == r;
    }
}