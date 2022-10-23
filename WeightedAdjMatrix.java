import java.util.Scanner;

public class WeightedAdjMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            int arr[][] = new int[nodes][nodes];
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                arr[u][v] = w;
                arr[v][u] = w;
            }
            for (int i = 0; i < nodes; i++) {
                for (int j = 0; j < nodes; j++)
                    System.out.println("Weight edge from " + i + " to " + j + " is " + arr[i][j]);
                System.out.println();
            }
        }
    }
}