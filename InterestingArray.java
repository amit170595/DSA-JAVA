import java.util.Scanner;

public class InterestingArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                int i = 0;
                for (i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                int k = sc.nextInt();
                int start = 0, end = n - 1;
                int flag = 0;
                while (start < end) {
                    if (a[start] + a[end] == k) {
                        System.out.println(start + " " + end);
                        flag = 1;
                        break;
                    } else {
                        if (a[start] + a[end] > k) {
                            end--;
                        } else {
                            start++;
                        }
                    }
                }
                if (flag == 0) {
                    System.out.println("no answer");
                }
            }
        }
    }
}
