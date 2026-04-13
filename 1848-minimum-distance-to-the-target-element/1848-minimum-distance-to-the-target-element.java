class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int index = Integer.MAX_VALUE;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]== target){
                if( Math.abs(i - start) < index - start)
                index = i;
            }
        }
        return Math.abs(index-start);
    }
}