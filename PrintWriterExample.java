import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("C:\\Users\\amitr\\Desktop\\DSA JAVA\\Test1\\text1.text");
        pw.println(100);
        pw.println(100.1231);
        pw.println("Read in File");
        pw.println('c');
        for (int i = 0; i < 5; i++)
            pw.print(i + " ");
        pw.flush();
        pw.close();
    }
}