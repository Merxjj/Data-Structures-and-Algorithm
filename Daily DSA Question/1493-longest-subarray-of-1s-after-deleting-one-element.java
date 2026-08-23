class Solution {
    public int longestSubarray(int[] nums) {
       int maxOnes = 0;
       int currentOnes = 0;
       int zero = 0;
       int j =0;
       for(int i=0;i<nums.length;i++){
            while(j<nums.length && zero <=1){
                if(nums[j]==0)
                {
                    zero++;
                }
                    j++;
                if(zero>1){
                    zero--;
                    j--;
                    break;
                }
            }
            currentOnes = j-i-1;
            maxOnes = Math.max(currentOnes,maxOnes);
            if(nums[i] == 0)zero--;

       } 
       return maxOnes;
    }
}