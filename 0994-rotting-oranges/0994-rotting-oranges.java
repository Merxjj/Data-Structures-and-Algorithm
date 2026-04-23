import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        
        // Step 1: Initialize queue with rotten oranges & count fresh
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        
        // Directions: up, down, left, right
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        int minutes = 0;
        
        // Step 2: BFS
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int r = cell[0], c = cell[1];
                
                for (int[] d : directions) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    
                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        fresh--;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
            
            minutes++;
        }
        
        // Step 3: Result
        return fresh == 0 ? minutes : -1;
    }
}