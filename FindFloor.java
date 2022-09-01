import java.util.Scanner;

public class FindFloor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int index = floorSearch(arr, 0, n - 1, x);
                System.out.println(index);
            }
        }
    }

    static int floorSearch(int arr[], int low, int high, int x) {
        if (low > high)
            return -1;
        if (x >= arr[high])
            return high;
        int mid = (low + high) / 2;
        if (arr[mid] == x)
            return mid;
        if (mid > 0 && arr[mid - 1] <= x && x < arr[mid])
            return mid - 1;
        if (x < arr[mid])
            return floorSearch(arr, low, mid - 1, x);
        return floorSearch(arr, mid + 1, high, x);
    }
}
