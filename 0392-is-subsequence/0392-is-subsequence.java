class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t))return true;
        if(s.length() == 0)return true;
        int S = s.length();
        int T = t.length();

        if(S > T)return false;
        int j = 0,i = 0;
        while(i < T){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            i++;
            if(j == S)return true;
        }
        return false;
    }
}