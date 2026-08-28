class Solution {// with using extra space
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        int n = s.length();
        for(int i = 0;i<n;i++){
            int j =0;
            while( j<goal.length() && s.charAt((i+j)%n) == goal.charAt(j)){
                j++;
            }
            if(j == goal.length())return true;
        }
        return false;
    }
}