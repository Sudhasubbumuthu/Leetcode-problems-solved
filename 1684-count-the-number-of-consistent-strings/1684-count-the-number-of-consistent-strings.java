class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for(String word : words){
            int f = 0;
            for(int i = 0; i < word.length(); i++){
                if(allowed.indexOf(word.charAt(i)) == -1){
                    f = 1;
                    break;
                }
            }
            if(f == 0)
                ans += 1;
        }
        return ans;
    }
}