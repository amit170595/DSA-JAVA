import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class StockSpanProblem {
    static ArrayList<Integer> calculateSpan(int arr[], int n) {
        Deque<Integer> s = new ArrayDeque<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i])
                s.pop();

            if (s.isEmpty())
                ans.add(i + 1);
            else {
                int top = s.peek();
                ans.add(i - top);
            }
            s.push(i);
        }

        return ans;
    }

    static void printArray(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int price[] = new int[n];
                for (int i = 0; i < n; i++)
                    price[i] = sc.nextInt();
                ArrayList<Integer> arr = calculateSpan(price, n);
                printArray(arr);
            }
        }
    }
}