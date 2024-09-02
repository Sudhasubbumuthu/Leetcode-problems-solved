class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        int l = 0;
        int f = 0;
        for(int count : mp.values()){
            if(count % 2 == 0){
                l += count;
                continue;
            }
            l += (count / 2) * 2;
            if(f == 0 && count % 2 != 0){
                l += 1;
                f = 1;
            }
        }
        return l;
    }
}