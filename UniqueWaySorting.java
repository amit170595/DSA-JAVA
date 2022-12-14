import java.util.Scanner;

public class UniqueWaySorting {
    static int sortCheck(int arr[], int start, int end) {
        if (start + 1 == end)
            return 1;
        int mid = (start + end) / 2;
        int h1 = sortCheck(arr, start, mid);
        int h2 = sortCheck(arr, mid, end);
        if (h1 == h2 && h1 == (end - start) / 2 && arr[mid - 1] <= arr[mid])
            return end - start;
        if (h1 > h2)
            return h1;
        else
            return h2;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            while (test-- != 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.println(sortCheck(arr, 0, n));
            }
        }

    }
}
