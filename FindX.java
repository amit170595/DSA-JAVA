import java.util.Scanner;

public class FindX {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                char a[] = new char[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.next().charAt(0);
                }
                char c = 'x';
                int res = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == c)
                        res++;
                }
                System.out.println(res);
            }
        }
    }
}
