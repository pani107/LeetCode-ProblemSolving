class Solution {
    public int maxAreaOfIsland(int[][] grid) {
       int n = grid.length;
        int m = grid[0].length;
         int maxi = 0;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area =  dfs(grid, i, j, m, n, visited);
                    maxi = Math.max(maxi, area);
                }
            }
        }
        return maxi;
    }

    private static int dfs(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        int area = 1;
        int[] xcor = {1, -1, 0, 0};
        int[] ycor = {0, 0, 1, -1};
        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int mx = xcor[k] + i;
            int ny = ycor[k] + j;

            if ((mx >= 0) && (mx < n) && (ny >= 0) && (ny < m) && (grid[mx][ny] == 1 && !visited[mx][ny])) {
                area += dfs(grid, mx, ny, m, n, visited);
            }
        }
        return area; 
    }
}