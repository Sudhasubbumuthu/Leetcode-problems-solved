class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for(int n : nums)
            elementSum += n;
        for(int n : nums){
            while(n != 0){
                digitSum += (n % 10);
                n /= 10;
            }
        }
        return elementSum - digitSum;
    }
}