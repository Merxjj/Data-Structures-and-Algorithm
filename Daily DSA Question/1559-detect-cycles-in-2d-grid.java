class Solution {
    int m, n;
    boolean[][] visited;
    
    public boolean containsCycle(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    if (dfs(grid, i, j, -1, -1)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] grid, int r, int c, int pr, int pc) {
        if (visited[r][c]) return true;
        
        visited[r][c] = true;
        
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};
        
        for (int k = 0; k < 4; k++) {
            int nr = r + dr[k];
            int nc = c + dc[k];
            
            if (nr >= 0 && nr < m && nc >= 0 && nc < n 
                && grid[nr][nc] == grid[r][c]) {
                
                // skip parent
                if (nr == pr && nc == pc) continue;
                
                if (dfs(grid, nr, nc, r, c)) return true;
            }
        }
        
        return false;
    }
}