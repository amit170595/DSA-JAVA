import java.util.HashMap;
import java.util.Scanner;

public class LeargestSubArrayWith0Sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.println(MaxSubArray(arr, n));
            }
        }
    }

    private static int MaxSubArray(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max_len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 && max_len == 0)
                max_len = 1;
            if (sum == 0)
                max_len = i + 1;
            if (map.get(sum) != null)
                max_len = Math.max(max_len, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return max_len;
    }
}
