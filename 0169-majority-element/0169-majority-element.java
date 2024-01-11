class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        int s = 0, ans = 0;
        for(Map.Entry<Integer, Integer> n : mp.entrySet()){
            if(s < n.getValue() && n.getValue() > (int)(nums.length/2)){
                s = n.getValue();
                ans = n.getKey();
            }
        }
        return ans;
    }
}