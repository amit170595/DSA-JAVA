import java.util.Scanner;

public class FindOne {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                int index = FOne(a, 0, (n - 1));
                System.out.println(index);
            }
        }
    }

    static int FOne(int a[], int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (a[mid] == 1 && (mid == 0 || a[mid - 1] == 0))
            return mid;
        else if (a[mid] == 0)
            return FOne(a, mid + 1, end);
        else
            return FOne(a, start, mid - 1);
    }
}