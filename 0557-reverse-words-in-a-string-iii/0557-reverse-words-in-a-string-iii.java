class Solution {
    public String reverseWords(String s) {
       String[] arr = s.split("\\s+");
       StringBuilder ans = new StringBuilder();
       for(String t : arr){
           StringBuilder rev = new StringBuilder(t);
           rev.reverse();
           ans.append(rev).append(" ");
       }
       return ans.toString().trim();
    }
}