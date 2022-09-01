import java.util.Scanner;
import java.util.Vector;

public class ValidString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            short t = sc.nextShort();
            while (t-- > 0) {
                String s = sc.next();
                int len = s.length();
                if (canBeBalanced(s, len))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }

    static boolean canBeBalanced(String s, int n) {
        if (n % 2 == 1)
            return false;
        String k = "(";
        k += s + ")";
        Vector<String> d = new Vector<>();
        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) == '(')
                d.add("(");
            else {
                if (d.size() != 0)
                    d.remove(d.size() - 1);
                else
                    return false;
            }
        }
        if (d.isEmpty())
            return true;
        return false;
    }
}
