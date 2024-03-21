class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        int s = 0;
        for(int i : mp.values()){
            if(i > 1){
                s += ((i*(i-1))/2);
            }
        }
        return s;
    }
}