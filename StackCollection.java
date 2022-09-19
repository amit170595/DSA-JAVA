import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search("B"));
        s.push("C");
        s.push("D");
        System.out.println(s);
        System.out.println(s.search("B"));
        System.out.println(s.search("Z"));
    }
}