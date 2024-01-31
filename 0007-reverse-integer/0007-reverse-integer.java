class Solution {
    public int reverse(int x) {
       long s = 0,n = Math.abs(x);
       while(n > 0){
           s = (s*10) + (n%10);
           n = n/10;
       } 
       if(s > Integer.MAX_VALUE || s < Integer.MIN_VALUE)
            return 0;
       return (x < 0)? (int)s*-1 : (int)s;
    }
}