import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExaple {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\amitr\\Desktop\\DSA JAVA\\Test1\\text1.text");
        try (BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
    }
}
