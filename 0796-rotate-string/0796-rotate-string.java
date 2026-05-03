class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length())return false;
        String s2 = s+s;
        for(int i = 0;i< s2.length()-goal.length();i++){
            int j = 0;

            while(j < goal.length() && s2.charAt(i+j) == goal.charAt(j)){
                j++;
            }
            if(j == goal.length())return true;

        }
        return false;

        
    }
}