class Solution {
    public int numberOfSteps(int num) {
        int s = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
                s++;
            }
            if(num % 2 != 0){
                num -= 1;
                s++;
            }
        }
        return s;
    }
}