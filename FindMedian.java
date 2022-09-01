import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                for (int i = 0; i < n; i++)
                    a[i] = sc.nextInt();
                FindMedian ob = new FindMedian();
                ob.Sort(a, n);
                if (n % 2 == 0) {
                    System.out.println(a[n / 2]);
                } else {
                    System.out.println(a[(n + 1) / 2]);
                }
            }
        }
    }

    void Sort(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
