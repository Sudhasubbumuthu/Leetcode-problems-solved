class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i = 0; i < candies.length; i++)
            max = Math.max(candies[i], max);
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(max <= candies[i]+extraCandies)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}