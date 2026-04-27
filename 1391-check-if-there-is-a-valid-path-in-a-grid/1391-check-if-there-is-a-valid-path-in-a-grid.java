class Solution {
    int[][][] dirs = {
        {},
        {{0,-1},{0,1}},
        {{-1,0},{1,0}},
        {{0,-1},{1,0}},
        {{0,1},{1,0}},
        {{0,-1},{-1,0}},
        {{0,1},{-1,0}}
    };

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        return dfs(0, 0, grid, vis);
    }

    boolean dfs(int i, int j, int[][] grid, boolean[][] vis) {
        int m = grid.length, n = grid[0].length;
        if (i == m - 1 && j == n - 1) return true;
        vis[i][j] = true;

        for (int[] d : dirs[grid[i][j]]) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || nj < 0 || ni >= m || nj >= n || vis[ni][nj]) continue;

            for (int[] back : dirs[grid[ni][nj]]) {
                if (ni + back[0] == i && nj + back[1] == j) {
                    if (dfs(ni, nj, grid, vis)) return true;
                }
            }
        }
        return false;
    }
}