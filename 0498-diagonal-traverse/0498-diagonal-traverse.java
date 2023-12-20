class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0,col = 0;
        int n = mat.length, m = mat[0].length;
        int i = 0;
        boolean up = true;
        int[] arr = new int[n*m];
        while(row < n && col < m){
            if(up){
                while(row > 0 && col < m-1){
                    arr[i++] = mat[row][col];
                    row--;
                    col++;
                }
                arr[i++] = mat[row][col];
                if(col == m-1){//this is for 3
                    row++;
                }
                else{//this is for 1
                    col++;
                }
            }
            else{
                while(col > 0 && row < n-1){
                    arr[i++] = mat[row][col];
                    row++;
                    col--;
                }
                arr[i++] = mat[row][col];
                if(row == n-1){//in picture this condition apply for 8
                    col++;
                }
                else{//this for 4
                    row++;
                }
            }
            up = !up;
        }
        return arr;
    }
}