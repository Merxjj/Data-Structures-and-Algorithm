class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDistance = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(words[i].equals(target)){
                int distance = Math.abs(i-startIndex);
                int circularDistance = n-distance;
                minDistance = Math.min(minDistance , Math.min(distance,               circularDistance));
            }
        }

        return minDistance == Integer.MAX_VALUE? -1 : minDistance;
    }
}