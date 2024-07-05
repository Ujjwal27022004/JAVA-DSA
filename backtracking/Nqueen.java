package backtracking;

class NQueen {

    public static int N = 4;

    public static boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        // Check if there's a queen in the same column above
        for (i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueen(int[][] board, int row) {
        if (row == N) {
            return true;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                if (nQueen(board, row + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int board[][] = { { 0, 0, 0, 0},
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 } };

        boolean solved = nQueen(board, 0);

        if (solved) {
            System.out.println("Solution found:");
            printSolution(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
