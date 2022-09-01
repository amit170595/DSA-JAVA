import java.util.Scanner;

public class FindTheWindow {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                for (int i = 0; i < n; i++)
                    a[i] = sc.nextInt();
                int start, end;
                for (start = 0; start < n - 1; start++) {
                    if (a[start] > a[start + 1])
                        break;
                }
                for (end = n - 1; end > 0; end--) {
                    if (a[end] < a[end - 1])
                        break;
                }
                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
                for (int i = start; i <= end; i++) {
                    if (max < a[i])
                        max = a[i];
                    if (min > a[i])
                        min = a[i];
                }
                for (int i = 0; i < start; i++) {
                    if (a[i] > min)
                        start = i;
                }
                for (int i = end; i < n; i++) {
                    if (a[i] < max)
                        end = i;
                }
                System.out.println(start + " " + end);
            }
        }
    }
}
