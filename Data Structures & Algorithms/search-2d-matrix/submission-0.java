class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int l=0, r1 = row * col -1;
        while(l<=r1){
            int m = l+ (r1-l)/2;
            int r = m/col, c = m %col;
            if (target > matrix[r][c]) {
                l = m + 1;
            } else if (target < matrix[r][c]) {
                r1 = m - 1;
            } else {
                return true;
            }
        }
        return false;
}
}
