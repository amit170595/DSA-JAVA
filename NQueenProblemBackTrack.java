import java.util.Scanner;

public class NQueenProblemBackTrack {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] board = new int[n][n];
            if (!NQueen(board, n, 0)) {
                System.out.println("Solution Does Not Exists");
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    private static boolean NQueen(int[][] board, int n, int col) {
        if (col >= n)
            return true;
        for (int i = 0; i < n; i++) {
            if (IsValid(board, i, col, n)) {
                board[i][col] = 1;
                if (NQueen(board, n, col + 1))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    private static boolean IsValid(int[][] board, int row, int col, int n) {
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 1)
                return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }
}
