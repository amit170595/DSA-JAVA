import java.util.Scanner;

public class GFGMaximizeSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.println(maximizeSum(arr, n));
            }
        }
    }

    public static int maximizeSum(int arr[], int n) {
        int[] map = new int[100001];
        for (int x : arr) {
            map[x]++;
        }
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];
            if (map[curr] != 0) {
                sum += curr;
                map[curr]--;
                if (map[curr - 1] != 0) {
                    map[curr - 1]--;
                }
            }
        }
        return sum;
    }
}
