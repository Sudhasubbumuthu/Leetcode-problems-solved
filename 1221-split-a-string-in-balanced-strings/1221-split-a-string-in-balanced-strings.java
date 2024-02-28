class Solution {
    public int balancedStringSplit(String s) {
        int c = 0, ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'L')
                c++;
            else
                c--;
            if (c == 0)
                ans++;
        }
        return ans;
    }
}