class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s = 0;
        for(int i = 0; i < nums.size(); i++){
            if(k == addBinaryIndex(i))
                s += nums.get(i);
        }
        return s;
    }
    public int addBinaryIndex(int n){
        String s = Integer.toBinaryString(n);
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1')
                c++;
        }
        return c;
    }
}