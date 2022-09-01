import java.util.Scanner;

public class MinusPlus {
    static boolean minusMinusPlus(String S, String T) {
        char s[] = S.toCharArray();
        char t[] = T.toCharArray();
        if (s.length < t.length)
            return false;

        if (s.length == t.length && s != t)
            return false;

        int s1 = 0, t1 = 0;

        while ((s1 < s.length) && (t1 < t.length)) {
            if (t[t1] == '-' && s[s1] == '+')
                return false;
            if (t[t1] == '+' && s[s1] == '-' && s[s1 + 1] == '-')
                s1++;
            else if (t[t1] == '+' && s[s1] == '-' && s[s1 + 1] != '-')
                return false;
            s1++;
            t1++;
        }

        if (s1 != s.length || t1 != s.length)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String S = sc.next();
                String T = sc.next();
                if (minusMinusPlus(S, T)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
