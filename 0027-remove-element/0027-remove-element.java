class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length-1;
        int count = 0;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]==val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                count++;
            }
        }

        return nums.length-count;
    }
}