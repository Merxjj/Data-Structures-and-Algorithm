class Solution {
    public int myAtoi(String s) {
        if(s == null   || s.length()==0 )return 0;

        int i = 0;
        int n = s.length();
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if( i<n  && (s.charAt(i) == '+'||s.charAt(i) == '-')){
            if(s.charAt(i)== '-')sign*=-1;
            i++;
        }

        if(i<n && (!(s.charAt(i)>='0' && s.charAt(i)<='9'))){
            return 0;
        }
        int result = 0;
        while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9') ){
            int digit = s.charAt(i)-'0';

            if(result > (Integer.MAX_VALUE - digit)/10){
                return sign == 1?Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result*10 + digit;
            i++;
        }
        return result*sign;
        
    }
}
