class Solution {
    public int compress(char[] chars) {
        char curr ;
        int l = 0;
        int i = 0;
        while(i<chars.length){   // Very important 
        int count = 0;
            curr = chars[i];
            while(i<chars.length && curr == chars[i]){
                count +=1;
                i++;
            }
            chars[l++] = curr;
            if(count > 1){
                String s = "" + count;
                for(char c : s.toCharArray()){
                    chars[l++] = c;
                }
            }
        }
        return l;

    }
}