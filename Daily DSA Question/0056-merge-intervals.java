
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals by starting point
        Arrays.sort(intervals, (a, b) ->
            Integer.compare(a[0], b[0])
        );

        // Step 2: Create a new list to store merged intervals
        List<int[]> result = new ArrayList<>();

        // Step 3: Add the first interval
        result.add(intervals[0]);

        // Step 4: Traverse the remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            // Get the last interval from our result list
            int[] last = result.get(result.size() - 1);

            // Step 5: Check if current interval overlaps
            if (intervals[i][0] <= last[1]) {

                // Merge intervals by updating ending point
                last[1] = Math.max(last[1], intervals[i][1]);

            } else {

                // No overlap, add current interval
                result.add(intervals[i]);
            }
        }

        // Step 6: Convert ArrayList into 2D array
        return result.toArray(new int[result.size()][]);
    }
}
