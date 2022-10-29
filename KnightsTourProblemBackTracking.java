import java.util.Scanner;

public class KnightsTourProblemBackTracking {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] board = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = -1;
                }
            }
            int move_x[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
            int move_y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
            board[0][0] = 0;
            int pos = 1;
            if (!KnightTour(board, n, move_x, move_y, 0, 0, pos))
                System.out.println("Solution Does Not Exists");
            else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    private static boolean KnightTour(int[][] board, int n, int[] move_x, int[] move_y, int curr_x, int curr_y,
            int pos) {
        if (pos == n * n)
            return true;
        for (int i = 0; i < 8; i++) {
            int new_x = curr_x + move_x[i];
            int new_y = curr_y + move_y[i];
            if (isValid(new_x, new_y, board, n)) {
                board[new_x][new_y] = pos;
                if (KnightTour(board, n, move_x, move_y, new_x, new_y, pos + 1))
                    return true;
                board[new_x][new_y] = -1;
            }
        }
        return false;
    }

    private static boolean isValid(int x, int y, int[][] board, int n) {
        if (x >= 0 && y >= 0 && x < n && y < n && board[x][y] == -1)
            return true;
        return false;
    }
}
