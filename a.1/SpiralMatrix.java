import java.util.Scanner;

public class SpiralMatrix {

    public static void fillInsideOutMatrix(int n) {
        int[][] matrix = new int[n][n];
        int value = 1; // The starting number to fill in the matrix

        int x = n / 2; // Start from the center (row)
        int y = n / 2; // Start from the center (column)

        matrix[x][y] = value++; // Fill the center of the matrix

        int step = 1; // Step size for moving outward (starts at 1 for 1st layer)
        
        // Keep filling until we've placed all values from 1 to n*n
        while (value <= n * n) {
            // Move right (x stays the same, y increases)
            for (int i = 0; i < step && value <= n * n; i++) {
                y++;
                matrix[x][y] = value++;
            }
            // Move down (y stays the same, x increases)
            for (int i = 0; i < step && value <= n * n; i++) {
                x++;
                matrix[x][y] = value++;
            }

            // Increase the step size for the next loop
            step++;

            // Move left (x stays the same, y decreases)
            for (int i = 0; i < step && value <= n * n; i++) {
                y--;
                matrix[x][y] = value++;
            }
            // Move up (y stays the same, x decreases)
            for (int i = 0; i < step && value <= n * n; i++) {
                x--;
                matrix[x][y] = value++;
            }

            // Increase step size again for the next spiral loop
            step++;
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n): ");
        int n = scanner.nextInt();
        
        // Ensure that n is odd to have a well-defined center
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for 'n'.");                                                                                                                         //mera mu me lelo sab log bchodo
        } else {
            fillInsideOutMatrix(n);
        }

        scanner.close();
    }
}
