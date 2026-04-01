public class StarPattern {
    public static void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j <= i) { // For printing
                    System.out.print("* ");
                } else { // For space
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 4;
        printStar(number);
    }
}