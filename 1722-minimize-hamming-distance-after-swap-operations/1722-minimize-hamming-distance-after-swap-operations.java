class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        int[] parent = new int[n];
        
        for(int i = 0; i < n; i++) parent[i] = i;
        
        for(int[] swap : allowedSwaps){
            union(parent, swap[0], swap[1]);
        }
        
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            int root = find(parent, i);
            map.putIfAbsent(root, new HashMap<>());
            Map<Integer, Integer> freq = map.get(root);
            freq.put(source[i], freq.getOrDefault(source[i], 0) + 1);
        }
        
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            int root = find(parent, i);
            Map<Integer, Integer> freq = map.get(root);
            
            if(freq.getOrDefault(target[i], 0) > 0){
                freq.put(target[i], freq.get(target[i]) - 1);
            } else {
                ans++;
            }
        }
        
        return ans;
    }
    
    int find(int[] parent, int x){
        if(parent[x] != x){
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
    
    void union(int[] parent, int a, int b){
        int pa = find(parent, a);
        int pb = find(parent, b);
        if(pa != pb){
            parent[pa] = pb;
        }
    }
}