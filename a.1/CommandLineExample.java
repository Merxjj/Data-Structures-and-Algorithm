public class CommandLineExample {
    public static void main(String[] args) {
        try {
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                if (num > 1000 && num < 2000) {
                    throw new IllegalArgumentException("Number out of range: " + num);
                }
                System.out.println("Valid number: " + num);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
