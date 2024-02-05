class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        String str = s+s;
        int i = str.indexOf(goal);
        if(i >= 0)
            return true;
        return false;
    }
}