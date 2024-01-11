class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ck = 0;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += (nums[i]);
        }
        double avg = (double)sum/(double)k;
        ck = avg;
        for(int i=k; i<nums.length; i++){
            sum = sum-(nums[i-k])+nums[i];
            avg = (double)sum/(double)k;
            if(ck < avg)
                ck = avg;
        }
        return ck;
    }
}