class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n*n+1];
        int missing = 0;
        int repeated = 0;
        int count = 1;
            for(int i = 0;i<n*n+1;i++){
                arr[i] = 0;
            }
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[grid[i][j]]++;
            }
        }
        for(int i = 1;i<n*n+1;i++){
            if(arr[i] == 0){
                missing = i;
            }
            if(arr[i] == 2){
                repeated = i;
            }
        }
        return new int[]{repeated,missing};
    }
}