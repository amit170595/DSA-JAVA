import java.util.Scanner;

public class AdityaDinesh {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                char[] arr = sc.next().toCharArray();
                // char arr[]=new char[n];
                int i, d = 0, a = 0;
                for (i = 0; i <= n - 1; i++) {
                    if (arr[i] == 'D')
                        d++;
                    if (arr[i] == 'A')
                        a++;
                }
                if (d == a)
                    System.out.println("AdiDan");
                else if (d > a)
                    System.out.println("Danish");
                else
                    System.out.println("Aditya");
            }
        }
    }
}
