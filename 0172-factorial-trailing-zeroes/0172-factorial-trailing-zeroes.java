class Solution {
    public int trailingZeroes(int n) {
        if(n < 5)
            return 0;
        int s = 0;
        while(n >= 5){
            s += (n/5);
            n /= 5;
        }
        return s;
    }
}