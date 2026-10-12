
class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (find(i, j, 0, board, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean find(int r, int c, int idx,
                        char[][] board, String word) {

        if (idx == word.length()) {
            return true;
        }

        if (r < 0 || c < 0 ||
            r >= board.length || c >= board[0].length ||
            board[r][c] != word.charAt(idx)) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '#';

        boolean up = find(r - 1, c, idx + 1, board, word);
        boolean down = find(r + 1, c, idx + 1, board, word);
        boolean left = find(r, c - 1, idx + 1, board, word);
        boolean right = find(r, c + 1, idx + 1, board, word);

        board[r][c] = temp;

        return up || down || left || right;
    }
}