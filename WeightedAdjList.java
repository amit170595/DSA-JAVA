import java.util.ArrayList;
import java.util.Scanner;

class Edge {
    int dest;
    int wt;

    Edge(int d, int w) {
        dest = d;
        wt = w;
    }
}

public class WeightedAdjList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            ArrayList<ArrayList<Edge>> arr = new ArrayList<>(nodes);
            for (int i = 0; i < nodes; i++)
                arr.add(new ArrayList<>());
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                arr.get(u).add(new Edge(v, w));
                arr.get(v).add(new Edge(u, w));
            }
            for (int i = 0; i < nodes; i++) {
                System.out.println("Adjacent Lidt of vertex " + i + " is ");
                for (int j = 0; j < arr.get(i).size(); j++)
                    System.out.println(arr.get(i).get(j).dest + " and wt= " + arr.get(i).get(j).wt);
                System.out.println();
            }
        }
    }
}
