import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class GFGCountDistinctIsland {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[][] grid = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        grid[i][j] = sc.nextInt();
                    }
                }
                System.out.println(CountIsland(grid));
            }
        }
    }

    private static int CountIsland(int[][] grid) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ArrayList<Integer> list = new ArrayList<>();
                    dfs(grid, i, j, list, i, j);
                    set.add(list);
                }
            }
        }
        return set.size();
    }

    private static void dfs(int[][] grid, int i, int j, ArrayList<Integer> list, int xa, int ya) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0)
            return;
        grid[i][j] = 0;
        list.add(xa-i);
        list.add(ya-j);
        dfs(grid, i + 1, j, list, xa, ya);
        dfs(grid, i - 1, j, list, xa, ya);
        dfs(grid, i, j + 1, list, xa, ya);
        dfs(grid, i, j - 1, list, xa, ya);
    }
}
