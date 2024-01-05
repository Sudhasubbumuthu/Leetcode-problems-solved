class Solution {
    public int strStr(String haystack, String ne) {
        for(int i=0; i<=haystack.length()-ne.length(); i++){
            String cur = haystack.substring(i,i+ne.length());
            if(cur.equals(ne))
                return i;
        }
        return -1;
    }
}