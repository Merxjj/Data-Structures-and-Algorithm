class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l = 0;
        int r = 0;
        HashSet<Character> hs = new HashSet<>();
        int maxLength = 0;
        while(r<s.length()){
            char c = s.charAt(r);
            while(hs.contains(c) ){
              hs.remove(s.charAt(l));
              l++;  
            }
            hs.add(c);
            maxLength = Math.max(maxLength,r-l+1);
            r++;
        } 
        return maxLength;
    }
}