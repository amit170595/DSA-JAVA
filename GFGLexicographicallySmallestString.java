import java.util.Scanner;
import java.util.Stack;

public class GFGLexicographicallySmallestString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String str = sc.next();
                int k = sc.nextInt();
                System.out.println(LexicoGraphicalString(str, k));
            }
        }
    }

    private static String LexicoGraphicalString(String s, int k) {
        int sz = s.length();
        if (isPow(sz)) {
            k /= 2;
        } else {
            k *= 2;
        }
        if (k > sz)
            return "-1";
        int removed = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < sz; i++) {
            while (!st.empty() && removed < k && st.peek() > s.charAt(i)) {
                st.pop();
                removed++;
            }
            st.push(s.charAt(i));
        }
        while (removed < k) {
            st.pop();
            removed++;
        }
        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    private static boolean isPow(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += (n & 1);
            n >>= 1;
        }
        return cnt > 1 ? false : true;
    }
}
