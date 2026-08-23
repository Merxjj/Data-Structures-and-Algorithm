class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length<k)return -1.0;
        double ans = Double.NEGATIVE_INFINITY;
        int j = 0;
        double sum = 0;
        for(int i =0 ;i<nums.length-k+1;i++){
            
            while((j-i)!=k && j<nums.length){
                sum+=nums[j];
                j++;
            }
            ans = Math.max(sum/k,ans);
            sum-=nums[i];
        }
        return ans;
    }
}