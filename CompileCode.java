import java.util.Scanner;

public class CompileCode {
    static int top = -1;

    public static void push(String stack[], char value, int n) {
        if (top == n - 1) {
            System.out.println("overflow");
            return;
        }
        top++;
        stack[top] = Character.toString(value);
    }

    public static int find_res(String stack[], int n) {
        int open = 0;
        int close = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (open == close && stack[i] == ">")
                return res;
            else if (stack[i] == "<") {
                open++;
            } else {
                close++;
                if (open == close)
                    res = close * 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                String stack[] = new String[n];
                char value;
                for (int i = 0; i < n; i++) {
                    value = sc.next().charAt(0);
                    push(stack, value, n);
                }
                int res = find_res(stack, n);
                System.out.println(res);
                top = -1;
            }
        }
    }
}
