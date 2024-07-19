class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minArr = new ArrayList<>();
        for (int r = 0; r < matrix.length; r++) {
            int min = Integer.MAX_VALUE;
            for (int c = 0; c < matrix[0].length; c++) {
                min = Math.min(min, matrix[r][c]);
            }
            minArr.add(min);
        }
        List<Integer> maxArr = new ArrayList<>();
        for (int c = 0; c < matrix[0].length; c++) {
            int max = Integer.MIN_VALUE;
            for (int r = 0; r < matrix.length; r++) {
                max = Math.max(max, matrix[r][c]);
            }
            maxArr.add(max);
        }
        List<Integer> ans = new ArrayList<>();
        for (int a : maxArr) {
            if (minArr.contains(a)) {
                ans.add(a);
            }
        }
        return ans;
    }
}