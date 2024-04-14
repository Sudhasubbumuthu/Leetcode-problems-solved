class Solution {
    public int countKeyChanges(String s) {
        int c = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(i+1)))
                c++;
        }
        return c;
    }
}