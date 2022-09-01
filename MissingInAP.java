import java.util.Scanner;

public class MissingInAP {
    static int MissingAP(int[] arr, int low, int high, int diff, int missing_ele) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == (arr[0] + mid * diff))
                return MissingAP(arr, mid + 1, high, diff, missing_ele);
            else {
                missing_ele = arr[0] + mid * diff;
                return MissingAP(arr, low, mid - 1, diff, missing_ele);
            }
        }
        return missing_ele;
    }

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t != 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                int left_diff = arr[1] - arr[0];
                int right_diff = arr[n - 1] - arr[n - 2];
                int diff, missing_ele;
                if (left_diff == right_diff) {
                    diff = left_diff;
                    System.out.println(MissingAP(arr, 0, n - 1, diff, -1));
                    t--;
                    continue;
                }
                if (left_diff < right_diff) {
                    missing_ele = arr[n - 1] - left_diff;
                    System.out.println(missing_ele);
                } else {
                    missing_ele = arr[0] + right_diff;
                    System.out.println(missing_ele);
                }
                t--;
            }
        }
    }
}
