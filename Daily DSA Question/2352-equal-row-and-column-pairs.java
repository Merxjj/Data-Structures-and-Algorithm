class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            String row = "";
            for(int j = 0;j<grid[0].length;j++){
                row = row+grid[i][j]+",";
            }
            map.put(row, map.getOrDefault(row,0)+1);
        }
        for(int j = 0;j<grid[0].length;j++){
            String col = "";
            for(int i=0;i<grid.length;i++){
                col = col+grid[i][j]+",";
            }
            count += map.getOrDefault(col,0);
        }
        return count ;
        
    }
}