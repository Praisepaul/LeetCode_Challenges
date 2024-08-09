class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        spiral(matrix, m, n, res, 0, -1, 0, 1);

        return res;
    }

    void spiral(int[][] matrix, int m, int n, List<Integer> res, int r, int c, int dr, int dc){
        if(m == 0 || n == 0)
            return;
        
        for(int i = 0; i < n; i++){
            r = r + dr;
            c = c + dc;

            res.add(matrix[r][c]);
        }

        spiral(matrix, n, m - 1, res, r, c, dc, -dr);
    }
}