import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
            for (int i = 0; i < nodes; i++) {
                adjList.add(new ArrayList<>());
            }
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                AddEdge(adjList, u, v);
            }
            for (int i = 0; i < nodes; i++) {
                System.out.println("Adjucency List of Vertex " + i + " is");
                for (int j = 0; j < adjList.get(i).size(); j++) {
                    System.out.print(adjList.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    private static void AddEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

}
