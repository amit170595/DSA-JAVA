import java.util.Scanner;

public class TugOfWarBackTracking {
    static boolean[] cur_ele;
    static boolean isPossible;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                TugOfWar(arr, n);
            }
        }
    }

    private static void TugOfWar(int[] arr, int n) {
        cur_ele = new boolean[n];
        int totalSum = 0;
        isPossible = false;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            cur_ele[i] = false;
        }
        TugOfWarRecursiion(arr, n, 0, 0, 0, totalSum);
        if (isPossible)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static void TugOfWarRecursiion(int[] arr, int n, int selected, int curr_sum, int curr_pos, int totalSum) {
        if (curr_pos == n)
            return;
        if (selected > n / 2)
            return;
        selected++;
        curr_sum += arr[curr_pos];
        cur_ele[curr_pos] = true;
        if (selected == n / 2) {
            int rem_sum = totalSum - curr_sum;
            if (Math.abs(curr_sum - rem_sum) == 0)
                isPossible = true;
        } else {
            TugOfWarRecursiion(arr, n, selected, curr_sum, curr_pos + 1, totalSum);
        }
        selected--;
        curr_sum -= arr[curr_pos];
        cur_ele[curr_pos] = false;
        TugOfWarRecursiion(arr, n, selected, curr_sum, curr_pos + 1, totalSum);
    }
}
