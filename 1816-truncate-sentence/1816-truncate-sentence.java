class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String split[] = s.split("\\s+");
        for(int i = 0; i < k; i++){
            sb.append(split[i]);
            if(i != k-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}