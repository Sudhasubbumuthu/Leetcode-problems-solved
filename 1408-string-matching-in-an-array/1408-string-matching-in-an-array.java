class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        String str = String.join(" ", words);
        for (int i = 0; i < words.length; i++) {
            if (str.indexOf(words[i]) != str.lastIndexOf(words[i]))
                ans.add(words[i]);
        }
        return ans;
    }
}