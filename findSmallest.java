import java.util.Scanner;

public class findSmallest {
    static final int MAX = 1000;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(findDuplicate(arr, n, k));
        }
    }

    static int findDuplicate(int arr[], int n, int k) {
        int[] freq = new int[MAX];
        for (int i = 0; i < n; i++) {
            if (arr[i] < 1 && arr[i] > MAX) {
                System.out.println("Out of range");
                return -1;
            }
            freq[arr[i]] += 1;
        }
        for (int i = 0; i < MAX; i++) {
            if (freq[i] == k)
                return i;
        }
        return -1;
    }
}
