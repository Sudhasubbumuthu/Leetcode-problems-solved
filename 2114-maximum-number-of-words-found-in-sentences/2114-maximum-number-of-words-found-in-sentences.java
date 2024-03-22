class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i < sentences.length; i++){
            String[] s = sentences[i].split("\\s+");
            max = Math.max(max, s.length);
        }
        return max;
    }
}