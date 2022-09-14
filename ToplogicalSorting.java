import java.util.Scanner;
import java.util.Stack;

public class ToplogicalSorting {
    static Stack<Integer> st;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            st = new Stack<>();
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            int arr[][] = new int[nodes][nodes];
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                arr[u][v] = 1;
            }
            int visited[] = new int[100005];
            for (int i = 0; i < nodes; i++) {
                if (visited[i] == 0) {
                    TopologicalSort(arr, nodes, i, visited);
                }
            }
        }
        while (!st.empty()) {
            System.out.print(st.pop() + " ");
        }
    }

    private static void TopologicalSort(int[][] arr, int nodes, int u, int[] visited) {
        visited[u] = 1;
        for (int i = 0; i < nodes; i++) {
            if (arr[u][i] == 1 && visited[i] == 0) {
                TopologicalSort(arr, nodes, i, visited);
            }
        }
        st.push(u);
    }
}

/*
 * input
 * 8 8
 * 0 2
 * 1 2
 * 1 3
 * 2 4
 * 4 5
 * 4 6
 * 4 7
 * 3 4
 * output
 * 1 3 0 2 4 7 6 5
 */
