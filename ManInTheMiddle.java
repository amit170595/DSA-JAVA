import java.util.Scanner;

public class ManInTheMiddle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            StringBuilder sb = new StringBuilder(str);
            BackTrack(str, sb, 0);
        }
    }

    private static void BackTrack(String str, StringBuilder sb, int i) {
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }
        if (Character.isAlphabetic(str.charAt(i))) {
            if (Character.isLowerCase(str.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            } else {
                sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
            BackTrack(str, sb, i + 1);
            sb.setCharAt(i, str.charAt(i));
        }
        BackTrack(str, sb, i + 1);
    }
}