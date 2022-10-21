import java.util.Scanner;

public class MaximumSubArraySum2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.println(MaximumSum(arr, 0, n - 1));
            }
        }
    }

    private static int MaximumSum(int[] arr, int low, int high) {
        if (low == high)
            return arr[low];
        int mid = (low + high) / 2;
        int leftMax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i > low - 1; i--) {
            sum += arr[i];
            if (sum > leftMax)
                leftMax = sum;
        }
        int rightMax = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i < high + 1; i++) {
            sum += arr[i];
            if (sum > rightMax)
                rightMax = sum;
        }
        int maxLeftArr = MaximumSum(arr, low, mid);
        int maxRightArr = MaximumSum(arr, mid + 1, high);
        return Math.max(leftMax + rightMax, Math.max(maxLeftArr, maxRightArr));
    }
}
