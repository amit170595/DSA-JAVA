import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CycleDetect {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < nodes; i++)
                adj.add(new ArrayList<>());
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            if (isCycle(adj, nodes))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    private static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int nodes) {
        boolean visited[] = new boolean[nodes];
        for (int i = 0; i < nodes; i++) {
            if (!visited[i] && isCycleConnected(adj, i, nodes, visited))
                return true;
        }
        return false;
    }

    private static boolean isCycleConnected(ArrayList<ArrayList<Integer>> adj, int s, int nodes, boolean[] visited) {
        int parent[] = new int[nodes];
        Arrays.fill(parent, -1);
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int i = 0; i < adj.get(u).size(); i++) {
                int v = adj.get(u).get(i);
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                    parent[v] = u;
                } else if (parent[u] != v)
                    return true;
            }
        }
        return false;
    }
}

/*
 * Input
 * 10 11
 * 5 0
 * 4 0
 * 3 6
 * 8 7
 * 8 1
 * 9 3
 * 7 9
 * 2 0
 * 8 4
 * 8 2
 * 1 4
 * Output
 * YES
 */
