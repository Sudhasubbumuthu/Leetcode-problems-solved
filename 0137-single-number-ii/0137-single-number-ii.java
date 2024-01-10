class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }  
        for(Map.Entry<Integer, Integer> n : mp.entrySet()){
            if(n.getValue() == 1)
                return n.getKey();
        }
        return 0;
    }
}