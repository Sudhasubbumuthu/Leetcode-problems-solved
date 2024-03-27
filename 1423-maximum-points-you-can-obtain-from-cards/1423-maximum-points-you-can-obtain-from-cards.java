class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int minSubArray = 0;
        int totSum = 0, curSum = 0;
        for(int i = 0; i < cardPoints.length; i++){
            totSum += cardPoints[i];
            curSum += cardPoints[i];
            if(i < n-k) minSubArray += cardPoints[i];
            else{
                curSum -= cardPoints[i - (n-k)];
                minSubArray = Math.min(minSubArray, curSum);
            }
        }
        return totSum - minSubArray;
    }
}