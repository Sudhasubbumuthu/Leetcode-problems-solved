class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> mp = new HashMap<>()  ;
        // for(int i=0; i<nums.length; i++){
        //     mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer, Integer> n : mp.entrySet()){
        //     if(n.getValue() == 1)
        //         return n.getKey();
        // }
        // return 0;
        int s = nums[0];
        for(int i=1; i<nums.length; i++){
            s = s ^ nums[i];
        }
        return s;
    }
}