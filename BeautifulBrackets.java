import java.util.Scanner;
import java.util.Stack;

public class BeautifulBrackets {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int j = 1;

            while (j > 0) {

                String str = sc.next();
                if (str.charAt(0) == '-') {
                    break;
                } else {
                    System.out.print(j + ". ");

                    beauty_Bracket(str);

                }
                j++;
                System.out.println("");
            }
        }
    }

    static void beauty_Bracket(String str) {
        int count = 0;
        Stack<Character> stk = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '{') {
                stk.push(str.charAt(i));
            } else if (str.charAt(i) == '}') {
                if (!stk.empty())
                    stk.pop();

                else {
                    count++;
                    stk.push('{');
                }
            }
        }
        if (stk.size() != 0) {
            count += stk.size() / 2;
        }

        System.out.print(count);

    }
}
