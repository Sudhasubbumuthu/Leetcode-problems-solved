class Solution {
    public int lengthOfLastWord(String s1) {
        int c = 0;
        String s = s1.trim();
        for(int i =s.length()-1; i >= 0; i--){
            char q = s.charAt(i);
            if(q == ' ')
                return c;
            c++;
        }
        return c;
    }
}