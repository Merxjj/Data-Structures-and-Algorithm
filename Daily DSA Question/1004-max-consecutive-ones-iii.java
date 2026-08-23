class Solution {
    public int longestOnes(int[] nums, int k) {

        int j = 0;
        int countZeroes = 0;
        int maxOnes = 0;

        for (int i = 0; i < nums.length; i++) {

            while (j < nums.length && countZeroes <= k) {

                if (nums[j] == 0)
                    countZeroes++;

                j++;

                if (countZeroes > k) {
                    j--;
                    countZeroes--;
                    break;
                }
            }

            maxOnes = Math.max(maxOnes, j - i);
            if (nums[i] == 0)
                countZeroes--;
        }
        return maxOnes;
    }
}