import java.util.Scanner;

public class RatInMazeBackTrack {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] maze = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    maze[i][j] = sc.nextInt();
                }
            }
            int result[][] = new int[n][n];
            if (RatMaze(maze, result, 0, 0, n)) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Solution Does Not Exists");
            }
        }
    }

    private static boolean RatMaze(int[][] maze, int[][] result, int x, int y, int n) {
        if (x == n - 1 && y == n - 1) {
            result[x][y] = 1;
            return true;
        }
        if (IsValid(maze, x, y, n)) {
            result[x][y] = 1;
            if (RatMaze(maze, result, x + 1, y, n))
                return true;
            if (RatMaze(maze, result, x, y + 1, n))
                return true;
            result[x][y] = 0;
            return false;
        }
        return false;
    }

    private static boolean IsValid(int[][] maze, int x, int y, int n) {
        if (x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1)
            return true;
        return false;
    }
}
