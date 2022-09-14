import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BipartiteGraph {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            int arr[][] = new int[nodes][nodes];
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                arr[u][v] = 1;
                arr[v][u] = 1;
            }
            int[] color = new int[100005];
            Arrays.fill(color, -1);
            if (isBipartite(arr, color, 0, nodes))
                System.out.println("Graph is Bipartite");
            else
                System.out.println("Graph is Not Bipartite");
        }
    }

    private static boolean isBipartite(int[][] arr, int[] color, int root, int nodes) {
        color[root] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v = 0; v < nodes; v++) {
                if (arr[u][v] == 1) {
                    if (color[v] == -1) {
                        color[v] = 1 - color[u];
                        q.add(v);
                    } else if (color[v] == color[u])
                        return false;
                }
            }
        }
        return true;
    }
}
/*
 * Input
 * 5 5
 * 0 1
 * 1 2
 * 2 3
 * 3 0
 * 2 4
 * Output
 * Graph is Bipartite
 */