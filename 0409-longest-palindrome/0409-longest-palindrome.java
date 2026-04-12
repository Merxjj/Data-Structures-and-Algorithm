class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
    
        int oddCount = 0;
        int length = 0;
        for(char c :    map.keySet()){
            if(map.get(c)%2==0){
                length+=map.get(c);
            }else{
                length+=map.get(c)-1;
                oddCount++;
            }
            // we can also write map.get(c)/2*2 so that we can get all value for even
            // and n-1 value for odd
        }
        if(oddCount > 0)length++;
        return length;

    }
}