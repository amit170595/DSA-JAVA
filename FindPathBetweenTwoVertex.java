import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindPathBetweenTwoVertex {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            for (int i = 0; i < nodes; i++)
                arr.add(new ArrayList<>());
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                arr.get(u).add(v);
            }
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int visited[] = new int[100005];
            if (isPath(src, dest, visited, arr))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }

    private static boolean isPath(int src, int dest, int[] visited, ArrayList<ArrayList<Integer>> arr) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = 1;
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            if (node == dest) {
                return true;
            }
            for (int adj : arr.get(node)) {
                if (visited[adj] == 0) {
                    q.add(adj);
                    visited[adj] = 1;
                }
            }
        }
        return false;
    }
}

//   Input
//   8 9
//   0 1
//   1 2
//   0 3
//   3 4
//   3 5
//   4 5
//   4 6
//   5 7
//   6 7
//   3 7
//   output
//   True
 