import java.util.Scanner;

public class TwoStackOneAraay {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            StackArray sa = new StackArray(n);
            int stack1 = sc.nextInt();
            int stack2 = sc.nextInt();
            int ele;
            for (int i = 0; i < stack1; i++) {
                ele = sc.nextInt();
                sa.push1(ele);
            }
            for (int i = 0; i < stack2; i++) {
                ele = sc.nextInt();
                sa.push2(ele);
            }
            System.out.println("Stack1: ");
            sa.print1();
            System.out.println("stack2: ");
            sa.print2();
            int num = sa.top1 + 1;
            while (num != 0) {
                sa.pop1();
                num--;
            }
            sa.pop1();
        }
    }
}

class StackArray {
    public int size;
    public int top1, top2;
    public int arr[];

    StackArray(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    void push1(int data) {
        if (top1 < top2 - 1)
            arr[++top1] = data;
        else
            System.out.println("Stack1 Overflow");
    }

    void push2(int data) {
        if (top1 < top2 - 1)
            arr[--top2] = data;
        else
            System.out.println("Stack1 Overflow");
    }

    void pop1() {
        if (top1 > -1) {
            int popedElement = arr[top1--];
            System.out.println("Stack1 PopedElement: " + popedElement);
        } else
            System.out.println("Stack1 Underflow");
    }

    void pop2() {
        if (top1 < size) {
            int popedElement = arr[top2++];
            System.out.println("Stack2 PopedElement: " + popedElement);
        } else
            System.out.println("Stack2 Underflow");
    }

    void print1() {
        for (int i = top1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void print2() {
        for (int i = top2; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
