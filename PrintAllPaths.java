import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllPaths {
    static ArrayList<Integer> path;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            path = new ArrayList<>();
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            int arr[][] = new int[nodes][nodes];
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                arr[u][v] = 1;
            }
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int visited[] = new int[100005];
            DFS(nodes, src, dest, arr, visited);
        }
    }

    private static void DFS(int nodes, int src, int dest, int[][] arr, int[] visited) {
        path.add(src);
        visited[src] = 1;
        if (src == dest) {
            for (int ele : path) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < nodes; i++) {
            if (arr[src][i] == 1 && visited[i] == 0) {
                DFS(nodes, i, dest, arr, visited);
            }
        }
        path.remove(path.size() - 1);
        visited[src] = 0;
    }
}
