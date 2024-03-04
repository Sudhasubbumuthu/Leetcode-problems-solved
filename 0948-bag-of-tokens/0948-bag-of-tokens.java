class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0, max_s = 0;
        int l = 0, r = tokens.length-1;
        while(l <= r){
            if(power >= tokens[l]){
                power -= tokens[l];
                l++;
                score++;
                max_s = Math.max(score, max_s);
            }
            else if(score > 0){
                power += tokens[r];
                score--;
                r--;
            }
            else{
                break;
            }
        }
        return max_s;
    }
}