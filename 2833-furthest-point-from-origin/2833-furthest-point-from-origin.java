class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pos = 0;
        int blanks = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') pos--;
            else if (c == 'R') pos++;
            else blanks++;
        }

        return Math.abs(pos) + blanks;
        
    }
}