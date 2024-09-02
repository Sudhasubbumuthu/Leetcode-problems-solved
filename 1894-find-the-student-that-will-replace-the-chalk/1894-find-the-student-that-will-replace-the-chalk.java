class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long s = 0;
        for(int i = 0; i < chalk.length; i++) s += chalk[i];
        int rem = (int)(k % s);
        for(int i = 0; i < chalk.length; i++){
            if(rem >= chalk[i])
                rem -= chalk[i];
            else
                return i;
        }
        return 0;
    }
}