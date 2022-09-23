import java.util.Scanner;

public class CountSolution {
    static int countSolutions(int n, int val) {
        int total = 0;
        if (n == 1 && val >= 0)
            return 1;
        for (int i = 0; i <= val; i++) {
            total += countSolutions(n - 1, val - i);
        }
        return total;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int val = sc.nextInt();
                System.out.println(countSolutions(n, val));
            }
        }
    }
}
