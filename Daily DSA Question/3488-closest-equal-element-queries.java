class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        List<Integer> res = new ArrayList<>();
        
        for (int idx : queries) {
            ArrayList<Integer> list = map.get(nums[idx]);
            
            if (list.size() == 1) {
                res.add(-1);
                continue;
            }
            
            int pos = Collections.binarySearch(list, idx);
            
            int left = list.get((pos - 1 + list.size()) % list.size());
            int right = list.get((pos + 1) % list.size());
            
            int d1 = Math.abs(idx - left);
            int d2 = Math.abs(idx - right);
            
            d1 = Math.min(d1, n - d1);
            d2 = Math.min(d2, n - d2);
            
            res.add(Math.min(d1, d2));
        }
        
        return res;
    }
}