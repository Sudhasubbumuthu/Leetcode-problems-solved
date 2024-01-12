class Solution {
    public boolean halvesAreAlike(String s) {
        String v = "aeiouAEIOU";
        int c1 = 0, c2 = 0;
        for(int i=0; i<s.length(); i++){
            if(v.indexOf(s.charAt(i)) != -1){
                if(i < s.length()/2)
                    c1++;
                else
                    c2++;
            }
        }
        return c1==c2;
    }
}