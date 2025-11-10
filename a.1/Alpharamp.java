public class Alpharamp {
    public static void main(String[] args) {
        int N = 6; // Example input
        generateAlphaRamp(N);
    }

    public static void generateAlphaRamp(int N) {
        for (int i = 0; i < N; i++) {
            // Get the corresponding alphabet letter
            char letter = (char) ('A' + i);
            // Print the letter i+1 times separated by spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(letter);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
