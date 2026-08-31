class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!= 0)return false;
        int target = sum/2;
        Boolean[][] dp = new Boolean[nums.length][target+1];
        return helper(nums,target,0,dp);
    }
    public boolean helper(int[] nums,int target, int idx,Boolean[][] dp){
        if(target == 0)return true;
        if (idx == nums.length || target < 0) return false;
        if(dp[idx][target]!=null)return dp[idx][target];
        dp[idx][target] = helper( nums,target, idx+1,dp) || helper( nums,target-nums[idx], idx+1,dp);
        return dp[idx][target];
    }
}