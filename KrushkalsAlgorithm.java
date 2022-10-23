import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Edge1 {
    int src, dest, wt;

    Edge1(int s, int d, int w) {
        src = s;
        dest = d;
        wt = w;
    }
}

public class KrushkalsAlgorithm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            ArrayList<Edge1> graph = new ArrayList<>();
            for (int i = 0; i < e; i++) {
                int s = sc.nextInt();
                int d = sc.nextInt();
                int w = sc.nextInt();
                graph.add(new Edge1(s, d, w));
            }
            ArrayList<Edge1> res = Krushkal(graph, n);
            for (Edge1 ele : res) {
                System.out.println(ele.src + " " + ele.dest);
            }
        }
    }

    private static ArrayList<Edge1> Krushkal(ArrayList<Edge1> graph, int n) {
        int vertexSet[] = new int[n];
        for (int i = 0; i < n; i++)
            vertexSet[i] = i;
        graph.sort(new Comparator<Edge1>() {
            @Override
            public int compare(Edge1 o1, Edge1 o2) {
                return o1.wt - o2.wt;
            }
        });
        ArrayList<Edge1> result = new ArrayList<>();
        int count = 0, i = 0;
        while (count < n - 1) {
            Edge1 currEd = graph.get(i);
            int uset = getSet(currEd.src, vertexSet);
            int vset = getSet(currEd.dest, vertexSet);
            if (uset != vset) {
                result.add(currEd);
                count += 1;
                vertexSet[vset] = uset;
            }
            i += 1;
        }
        return result;
    }

    private static int getSet(int node, int[] vertexSet) {
        if (node == vertexSet[node])
            return node;
        return getSet(vertexSet[node], vertexSet);
    }
}

/*
 * 7 12
 * 0 1 1
 * 0 2 4
 * 1 2 3
 * 2 3 5
 * 1 3 7
 * 1 4 6
 * 2 5 2
 * 3 4 10
 * 3 5 8
 * 4 5 3
 * 4 6 9
 * 5 6 11
 */