import java.util.Scanner;

public class AdjucentMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            int[][] arr = new int[nodes][nodes];
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                arr[u][v] = 1;
                arr[v][u] = 1;
            }
            for (int i = 0; i < nodes; i++) {
                for (int j = 0; j < nodes; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}

// test 1
