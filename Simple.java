
import java.util.*;

public class Simple {
    // function to simplify a Unix - styled
    // absolute path
    static String simplify(String path) {

        // using vector in place of stack
        Vector<String> v = new Vector<String>();
        int n = path.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            String dir = "";

            // forming the current directory.
            while (i < n && path.charAt(i) != '/') {
                dir += path.charAt(i);
                i++;
            }

            // if ".." , we pop.
            if (dir.equals("..")) {
                if (v.size() != 0) {
                    v.remove(v.size() - 1);
                }
            } else if (dir.equals(".") || dir.equals("")) {
                // do nothing (added for better understanding.)
            } else {
                // push the current directory into the vector.
                v.add(dir);
            }
        }

        // forming the ans
        for (String i : v) {
            ans += "/" + i;
        }

        // vector is empty
        if (ans == "")
            return "/";

        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            String res = simplify(str);
            System.out.print(res);
        }
    }
}

// This code is contributed by decode2207.
