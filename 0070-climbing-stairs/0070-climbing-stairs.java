class Solution {
    public int CS(int n, int[] dp){
        if (n == 0 || n == 1) {
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        } 
        else{
            dp[n] = CS(n-1, dp) + CS(n-2, dp);
        }
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i = 0; i <= n; i++)
            dp[i] = -1;
        return CS(n, dp);
    }
}