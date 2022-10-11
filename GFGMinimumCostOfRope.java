import java.util.PriorityQueue;
import java.util.Scanner;

public class GFGMinimumCostOfRope {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long arr[] = new long[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextLong();
                }
                System.out.println(MinCost(arr, n));
            }
        }
    }

    private static long MinCost(long[] arr, int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long k : arr) {
            pq.add(k);
        }
        long cost = 0;
        while (pq.size() > 1) {
            long a = pq.remove();
            long b = pq.remove();
            long curr = a + b;
            cost += curr;
            pq.add(curr);
        }
        return cost;
    }
}
