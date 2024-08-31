class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(sb.indexOf(String.valueOf(s.charAt(i))) != -1){
                max = Math.max(max, sb.length());
                sb.delete(0,sb.indexOf(String.valueOf(s.charAt(i))) + 1);
                sb.append(s.charAt(i));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return Math.max(max, sb.length());
    }
}