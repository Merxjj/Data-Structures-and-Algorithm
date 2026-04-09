import java.util.*;

class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        // Separate even and odd numbers
        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();
        List<Integer> evenTarget = new ArrayList<>();
        List<Integer> oddTarget = new ArrayList<>();

        for (int x : nums) {
            if (x % 2 == 0) evenNums.add(x);
            else oddNums.add(x);
        }

        for (int x : target) {
            if (x % 2 == 0) evenTarget.add(x);
            else oddTarget.add(x);
        }

        // Sort all lists to pair smallest with smallest
        Collections.sort(evenNums);
        Collections.sort(oddNums);
        Collections.sort(evenTarget);
        Collections.sort(oddTarget);

        long totalDiff = 0;

        // Calculate positive differences for even numbers
        for (int i = 0; i < evenNums.size(); i++) {
            if (evenNums.get(i) < evenTarget.get(i)) {
                totalDiff += (evenTarget.get(i) - evenNums.get(i)) / 2;
            }
        }

        // Calculate positive differences for odd numbers
        for (int i = 0; i < oddNums.size(); i++) {
            if (oddNums.get(i) < oddTarget.get(i)) {
                totalDiff += (oddTarget.get(i) - oddNums.get(i)) / 2;
            }
        }

        return totalDiff;
    }
}
