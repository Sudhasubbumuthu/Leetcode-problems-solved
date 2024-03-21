class Solution {
    public boolean divideArray(int[] nums) {
        int r = nums.length/2;
        int s=0;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int e : m.values()){
            s += e/2;
        }

        return s == r;
    }
}