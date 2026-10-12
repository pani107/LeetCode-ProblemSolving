class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(0, board, result, n);
       return result;
    }
    private void solve(int row, char[][] board,
                       List<List<String>> result, int n) {
        if (row == n) {
            List<String> solution = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }
            result.add(solution);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';

                solve(row + 1, board, result, n);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(int row, int col,
                           char[][] board, int n) {
        int r = row - 1;
        int c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }
        r = row - 1;
        c = col + 1;

        while (r >= 0 && c < n) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c++;
        }
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        return true;
    }
}