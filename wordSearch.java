class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(existHelper(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean existHelper(char[][] board, String word, int i, int j, int index){
        if(index == word.length()){
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(index)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = existHelper(board, word, i + 1, j, index + 1)
                        || existHelper(board, word, i - 1, j, index + 1)
                        || existHelper(board, word, i, j + 1, index + 1)
                        || existHelper(board, word, i, j - 1, index + 1);
        board[i][j] = temp;
        return found;
    }
}