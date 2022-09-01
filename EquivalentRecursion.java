import java.util.Scanner;

public class EquivalentRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a = sc.next();
            String b = sc.next();
            if (areEquivalent(a, b)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    static boolean areEquivalent(String a, String b) {
        return !(leastLexiString(a).equals(leastLexiString(b)));
    }

    static String leastLexiString(String s) {
        if (s.length() == 1)
            return s;
        String x = leastLexiString(s.substring(0, s.length() / 2));
        String y = leastLexiString(s.substring(s.length() / 2));
        return String.valueOf((x + y).compareTo(y + x));
    }
}
