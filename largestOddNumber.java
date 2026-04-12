class Solution {
    public String largestOddNumber(String num) {

        for(int i = num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2 ==1){
                StringBuilder sb = new StringBuilder();
                for(int j = 0;j<=i;j++){
                    sb.append(num.charAt(j));
                }
                return sb.toString();
            }
        }
        return "";
    }
}
