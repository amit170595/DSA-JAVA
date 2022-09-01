import java.util.Scanner;

public class ReverceStringRecurion {
    static String RevStr(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return RevStr(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String str = sc.next();
                System.out.println(RevStr(str));
            }
        }
    }
}
