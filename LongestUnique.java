import java.util.Scanner;

public class LongestUnique {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String str = sc.next();
                int len = longestUniqueSubsttr(str);
                System.out.println(len);
            }
        }
    }

    public static int longestUniqueSubsttr(String str) {
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if (areDistinct(str, i, j))
                    res = Math.max(res, j - i + 1);
        return res;
    }

    public static Boolean areDistinct(String str, int i, int j) {
        boolean[] visited = new boolean[26];
        for (int k = i; k <= j; k++) {
            if (visited[str.charAt(k) - 'a'] == true)
                return false;
            visited[str.charAt(k) - 'a'] = true;
        }
        return true;
    }
}
