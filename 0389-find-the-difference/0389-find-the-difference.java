class Solution {
    public char findTheDifference(String s, String t) {
        int x = 0;
        for(char c1 : s.toCharArray()){
            x ^= c1;
        }
        for(char c2 : t.toCharArray()){
            x ^= c2;
        }
        return (char)x;
    }
}