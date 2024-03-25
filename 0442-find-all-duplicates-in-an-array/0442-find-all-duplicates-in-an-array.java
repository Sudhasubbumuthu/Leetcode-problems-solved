class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            if(e.getValue() > 1)
                ans.add(e.getKey());
        }
        return ans;
    }
}