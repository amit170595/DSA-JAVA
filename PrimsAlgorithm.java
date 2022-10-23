import java.util.Arrays;
import java.util.Scanner;

public class PrimsAlgorithm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            Graph1 g = new Graph1(n);
            for (int i = 0; i < e; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                g.addEdge(u, v, w);
            }
            g.primsAlgo();
        }
    }
}

class Graph1 {
    private int adjMat[][];
    private int nodes;

    Graph1(int n) {
        nodes = n;
        adjMat = new int[n][n];
    }

    public void addEdge(int u, int v, int w) {
        adjMat[u][v] = w;
        adjMat[v][u] = w;
    }

    public void primsAlgo() {
        int result[] = new int[nodes];
        Arrays.fill(result, -1);
        boolean mst[] = new boolean[nodes];
        int[] minimumWt = new int[nodes];
        Arrays.fill(minimumWt, Integer.MAX_VALUE);
        for (int i = 0; i < nodes - 1; i++) {
            int minV = minWt(minimumWt, mst);
            mst[minV] = true;
            for (int j = 0; j < nodes; j++) {
                if (adjMat[minV][j] > 0 && !mst[j]) {
                    if (minimumWt[j] > adjMat[minV][j]) {
                        result[j] = minV;
                        minimumWt[j] = adjMat[minV][j];
                    }
                }
            }
        }
        for (int i = 0; i < nodes; i++)
            System.out.println(result[i] + " to " + i);
    }

    private int minWt(int[] minimumWt, boolean[] mst) {
        int index = -1;
        for (int i = 0; i < nodes; i++) {
            if (!mst[i] && (index == -1 || minimumWt[index] > minimumWt[i]))
                index = i;
        }
        return index;
    }
}
