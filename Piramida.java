public class Piramida {
    public static void main(String[] args) {
        int n = 10;
        printStarPyramid(n);
    }

    static void printStarPyramid(int n) {
        printStarPyramid(n, 0);
    }

    static void printStarPyramid(int n, int currentRow) {
        // Base case
        if (currentRow == n) {
            return;
        }

        printSpaces(n, currentRow);

        printStars(currentRow);
        System.out.println();

        printStarPyramid(n, currentRow + 1);
    }

    static void printSpaces(int n, int currentRow) {
        for (int i = 0; i < n - currentRow - 1; i++) {
            System.out.print(" ");
        }
    }

    static void printStars(int currentRow) {
        for (int i = 0; i < 2 * currentRow + 1; i++) {
            System.out.print("*");
        }
    }
}

