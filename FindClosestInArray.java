import java.util.Scanner;

public class FindClosestInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.println(FindClosest(arr, n, k));
            }
        }
    }

    private static int FindClosest(int[] arr, int n, int k) {
        if (k < arr[0])
            return arr[0];
        if (k >= arr[n - 1])
            return arr[n - 1];
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == k)
                return arr[mid];
            if (arr[mid] > k) {
                if (mid != 0 && arr[mid - 1] < k) {
                    if (arr[mid] - k < k - arr[mid - 1])
                        return arr[mid];
                    else
                        return arr[mid + 1];
                } else
                    high = mid - 1;
            } else {
                if (mid < (n - 1) && arr[mid + 1] > k) {
                    if (k - arr[mid] < arr[mid + 1] - k)
                        return arr[mid];
                    else
                        return arr[mid + 1];
                } else
                    low = mid + 1;
            }
        }
        return 0;
    }
}
