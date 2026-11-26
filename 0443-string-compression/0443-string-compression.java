class Solution {
    public int compress(char[] chars) {
        char curr ;
        int l = 0;
        int r = 0;
        int count = 0;
        while(r <chars.length ){
            curr = chars[r];
            while(r < chars.length && curr == chars[r]){
                r++;
                count++;
            }
            chars[l++] = curr;
            if(count > 1){
                String s = "" + count;
                for(char c : s.toCharArray()){
                    chars[l++] = c;
                }
            }
            count = 0;
        }
        return l;
    }
}