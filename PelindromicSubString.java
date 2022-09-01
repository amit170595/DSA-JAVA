
import java.util.ArrayList;
import java.util.Scanner;

public class PelindromicSubString {
    static boolean checkPalindrome(String str) {
        int len = str.length();
        len--;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(len))
                return false;
            len--;
        }
        return true;
    }

    static void printSolution(ArrayList<ArrayList<String>> partitions) {
        for (ArrayList<String> i : partitions) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static ArrayList<ArrayList<String>> addStrings(ArrayList<ArrayList<String>> v, String s, ArrayList<String> temp,
            int index) {
        int len = s.length();
        String str = "";
        ArrayList<String> current = new ArrayList<>(temp);

        if (index == 0)
            temp.clear();
        for (int i = index; i < len; ++i) {
            str = str + s.charAt(i);
            if (checkPalindrome(str)) {
                temp.add(str);
                if (i + 1 < len) {
                    v = addStrings(v, s, temp, i + 1);
                } else {
                    v.add(temp);
                }
                temp = new ArrayList<>(current);
            }
        }
        return v;
    }

    static void partition(String s, ArrayList<ArrayList<String>> v) {
        ArrayList<String> temp = new ArrayList<>();
        v = addStrings(v, s, temp, 0);
        printSolution(v);
    }

    // Driver code
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                ArrayList<ArrayList<String>> partitions = new ArrayList<>();
                partition(s, partitions);
            }
        }
    }
}
