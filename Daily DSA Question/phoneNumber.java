class Solution {
    List<String> res = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return res;
        
        String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };
        
        backtrack(digits, 0, new StringBuilder(), map);
        return res;
    }
    
    void backtrack(String digits, int i, StringBuilder curr, String[] map) {
        if(i == digits.length()) {
            res.add(curr.toString());
            return;
        }
        
        String letters = map[digits.charAt(i) - '0'];
        
        for(char c : letters.toCharArray()) {
            curr.append(c);
            backtrack(digits, i + 1, curr, map);
            curr.deleteCharAt(curr.length() - 1); // backtrack
        }
    }
}
