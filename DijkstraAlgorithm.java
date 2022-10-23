import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edges {
    int dest, wt;

    Edges(int d, int w) {
        dest = d;
        wt = w;
    }
}

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            ArrayList<ArrayList<Edges>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            int s, d, w;
            for (int i = 0; i < e; i++) {
                s = sc.nextInt();
                d = sc.nextInt();
                w = sc.nextInt();
                graph.get(s).add(new Edges(d, w));
                graph.get(d).add(new Edges(s, w));
            }
            DijkstraAlgo(graph, n, 0);
        }
    }

    private static void DijkstraAlgo(ArrayList<ArrayList<Edges>> graph, int n, int u) {
        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[u] = 0;
        PriorityQueue<Pairs1> pq = new PriorityQueue<>(n, new Pairs1());
        pq.add(new Pairs1(0, u));
        boolean visited[] = new boolean[n];
        while (!pq.isEmpty()) {
            int vt = pq.peek().y;
            pq.remove();
            if (visited[vt])
                continue;
            else {
                visited[vt] = true;
                for (Edges ele : graph.get(vt)) {
                    int v = ele.dest;
                    int wt = ele.wt;
                    if (dist[v] > dist[vt] + wt) {
                        dist[v] = dist[vt] + wt;
                        pq.add(new Pairs1(dist[vt] + wt, v));
                    }
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println("Shorted distance from " + u + " to " + i + " = " + dist[i]);
    }
}

class Pairs1 implements Comparator<Pairs1> {
    int x, y;

    Pairs1() {
    }

    Pairs1(int i, int j) {
        x = i;
        y = j;
    }

    @Override
    public int compare(Pairs1 o1, Pairs1 o2) {
        return o2.x - o1.x;
    }
}