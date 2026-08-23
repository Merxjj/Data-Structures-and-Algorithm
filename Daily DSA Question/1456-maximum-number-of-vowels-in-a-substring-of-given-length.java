class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;
        int j = 0;
        for(int i = 0;i<s.length()-k+1;i++){
            while(j<s.length()&& j-i != k){
                if(s.charAt(j) == 'a' || s.charAt(j) == 'e' ||s.charAt(j) == 'i' || s.charAt(j) == 'o' ||s.charAt(j) == 'u'){
                count++;
                }
                j++;
            }
            maxCount = Math.max(maxCount,count);
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i'
             || s.charAt(i) == 'o' ||s.charAt(i) == 'u'){
                count--;
            }
        }
        return maxCount;
    }
}