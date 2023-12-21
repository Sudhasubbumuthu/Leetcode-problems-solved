class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr = new int[points.length];
        for(int i=0; i<points.length; i++)
            arr[i] = points[i][0];
        Arrays.sort(arr);
        int s = 0;
        for(int i=0; i<points.length-1; i++){
            if(arr[i+1]-arr[i] > s)
                s = arr[i+1]-arr[i];
        }
        System.gc();
        return s;
    }
}