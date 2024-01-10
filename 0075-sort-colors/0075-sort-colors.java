class Solution {
    public void sortColors(int[] nums) {
        int z=0, o=0, t=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                z++;
            else if(nums[i] == 1)
                o++;
            else
                t++;
        }
        int i = 0;
        System.out.print(z+" "+o+" "+t);
        while(o > 0 || z > 0 || t >0){
            if(z > 0){
                nums[i] = 0;
                i++;
                z--;
                System.out.print(0);
                continue;
            }
            else if(o > 0){
                nums[i] = 1;
                i++;
                o--;
                System.out.print(1);
                continue;
            }
            else{
                nums[i] = 2;
                i++;
                t--;
                System.out.print(2);
            }
        }
    }
}