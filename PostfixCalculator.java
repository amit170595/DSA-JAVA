import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculator {
    static int evaluatePostfix(char exp[], int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = exp[i];
            // if the current character is an operand, push it into the stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }
            // if the current character is an operator
            else {
                // remove the top two elements from the stack
                int x = stack.pop();
                int y = stack.pop();

                // evaluate the expression 'x op y', and push the
                // result back to the stack
                if (c == '+') {
                    stack.push(y + x);
                } else if (c == '-') {
                    stack.push(y - x);
                } else if (c == '*') {
                    stack.push(y * x);
                } else if (c == '/') {
                    stack.push(y / x);
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            char exp[] = new char[n];
            for (int i = 0; i < n; i++)
                exp[i] = sc.next().charAt(0);
            System.out.println(evaluatePostfix(exp, n));
        }
    }
}
