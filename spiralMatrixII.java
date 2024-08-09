class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;

        while (left <= right && top <= bottom) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                res[top][i] = num++;
            }
            top++;

            // Fill right column
            for (int i = top; i <= bottom; i++) {
                res[i][right] = num++;
            }
            right--;

            // Fill bottom row (if applicable)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res[bottom][i] = num++;
                }
                bottom--;
            }

            // Fill left column (if applicable)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res[i][left] = num++;
                }
                left++;
            }
        }
        
        return res;
    }
}
