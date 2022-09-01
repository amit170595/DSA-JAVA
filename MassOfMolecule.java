/*
1. Test your code for cases like (OHC(CH(O)9)7)2, Correct answer will be 2256.
2. If you are not getting any direction, think about how the stack can be useful, and the principle of LIFO.
3. Print the input string to check whether you are taking input in the right way or not.
4. If you are using a character array, declare its size wisely, keeping in mind extra space for NULL character. */

import java.util.Scanner;
import java.util.Stack;

public class MassOfMolecule {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            System.out.println(str);
            Calculate(str);
        }
    }

    static void Calculate(String str) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(') {
                stack.push(-1);
            } else if (x == ')') {
                int res = 0;
                while (stack.peek() != -1 && stack.isEmpty()) {
                    res += stack.pop();
                }
                stack.pop();
                stack.push(res);
            } else if (Character.isDigit(x)) {
                int ans = stack.pop();
                stack.push(x * ans);
            } else if (Character.isAlphabetic(x)) {
                if (x == 'H')
                    stack.push(1);
                if (x == 'C')
                    stack.push(12);
                if (x == 'O')
                    stack.push(16);
            }
        }
        int sum = 0;
        while (stack.isEmpty() == false) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}