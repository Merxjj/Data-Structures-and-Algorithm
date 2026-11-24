
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        // Initialize four boundaries
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // Continue until all boundaries cross
        while (top <= bottom && left <= right) {

            // Step 1: Traverse Left to Right (top row)
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++; // Move top boundary down

            // Step 2: Traverse Top to Bottom (right column)
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--; // Move right boundary left

            // Step 3: Traverse Right to Left (bottom row)
            // Check whether the bottom row still exists
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--; // Move bottom boundary up
            }

            // Step 4: Traverse Bottom to Top (left column)
            // Check whether the left column still exists
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++; // Move left boundary right
            }
        }

        // Return the spiral traversal
        return list;
    }
}
