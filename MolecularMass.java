import java.util.Scanner;
import java.util.Stack;

public class MolecularMass {
    public static void main(String[] args) {
        String s;
        try (Scanner kb = new Scanner(System.in)) {
            Stack<Integer> mass = new Stack<>();
            s = kb.nextLine();
            for (int i = 0; i < s.length(); i++) {
                int x;

                char ch = s.charAt(i);
                if (ch == 'H') {
                    x = 1;
                    mass.push(x);
                }
                if (ch == '2') {
                    x = mass.pop() * 2;
                    mass.push(x);
                }
                if (ch == 'O') {
                    x = 16;
                    mass.push(x);
                }
                if (ch == 'C') {
                    x = 12;
                    mass.push(x);
                }
                if (ch == '3') {
                    x = mass.pop() * 3;
                    mass.push(x);
                }
                if (ch == '4') {
                    x = mass.pop() * 4;
                    mass.push(x);
                }
                if (ch == '5') {
                    x = mass.pop() * 5;
                    mass.push(x);
                }
                if (ch == '6') {
                    x = mass.pop() * 6;
                    mass.push(x);
                }
                if (ch == '7') {
                    x = mass.pop() * 7;
                    mass.push(x);
                }
                if (ch == '8') {
                    x = mass.pop() * 8;
                    mass.push(x);
                }
                if (ch == '9') {
                    x = mass.pop() * 9;
                    mass.push(x);
                }
                if (ch == '(') {
                    x = 0;
                    mass.push(x);
                }
                if (ch == ')') {
                    int y;
                    x = 0;
                    do {
                        y = mass.pop();
                        x += y;
                    } while (y != 0);
                    mass.push(x);
                }
            }

            int molmass = 0;
            while (!mass.isEmpty()) {
                molmass += mass.pop();
            }

            System.out.println(molmass);
        }
    }
}
