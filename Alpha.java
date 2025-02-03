public class Alpha {
    public static void main(String[] args) {
        int n = 7; // Size of the pattern (should be an odd number for symmetry)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' at the first or last column, or at the middle row
                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
            
            }
    }
}
