class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int s = 0;
        for(int h : hours){
            if(h >= target)
                s += 1;
        }
        return s;
    }
}