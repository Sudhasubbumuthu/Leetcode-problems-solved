class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1)
            return s;
        int max = 0;
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            String odd = paliFind(i, i, s);
            String even = paliFind(i, i+1, s);
            if(max < odd.length()){
                max = odd.length();
                ans = odd;
            }
            if(max < even.length()){
                max = even.length();
                ans = even;
            }
        }
        return ans;
    }
    public String paliFind(int l, int r, String s){
        while((l >= 0 && r < s.length()) && (s.charAt(r) == s.charAt(l))){
                l--;
                r++;
        }
        return s.substring(l+1,r);
    }
}