class Solution {
    public int findDuplicate(int[] nums) {
      HashSet<Integer> hs=new HashSet<>();
      int n=nums.length;
      for(int i=0;i<n;i++){
        if(hs.contains(nums[i])){
            return nums[i];
        }
            hs.add(nums[i]);
        }
        return -1;
    }
}


// Approach: Staircase Search (Top-Right Corner)
// 1. Start from the top-right corner: row = 0, col = n-1.
// 2. If current element equals target → return true.
// 3. If current element is smaller than target → move down (row++).
// 4. If current element is greater than target → move left (col--).
// 5. Continue until row == m or col < 0.
// 6. If not found, return false.