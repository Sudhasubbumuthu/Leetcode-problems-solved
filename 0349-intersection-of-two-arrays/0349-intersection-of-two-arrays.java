class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        
        for(int i = 0; i<nums1.length; i++){
            if(!s.contains(nums1[i])){
                s.add(nums1[i]);
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(s.contains(nums2[i]) && !ans.contains(nums2[i]))
                ans.add(nums2[i]);
        }
        int[] arr = new int[ans.size()];
        int i = 0;
        for(int t : ans){
            arr[i++] = t;
        }
        return arr;
    }
}