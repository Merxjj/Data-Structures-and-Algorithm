class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(firstMin >= nums[i]){
                firstMin = nums[i];
            }else if(secondMin >= nums[i]){
                secondMin = nums[i];
            }else {
                return true;
            }
        }
        return false;
    }
}