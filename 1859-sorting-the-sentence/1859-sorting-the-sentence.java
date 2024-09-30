class Solution {
    public String sortSentence(String s) {
        StringBuilder ans = new StringBuilder();
        String arr[] = s.split("\\s+");
        String[] sort = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sort[arr[i].charAt(arr[i].length() - 1) - 1 - '0'] = arr[i].substring(0, arr[i].length() - 1);
        }
        for (String t : sort) {
            ans.append(t + " ");
        }
        return ans.toString().trim();
    }
}