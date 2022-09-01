import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        File f= new File("C:\\Users\\amitr\\Desktop\\DSA JAVA\\Test1");
        // f.mkdir();
        // System.out.println(f.exists());
        // File f1= new File("C:\\Users\\amitr\\Desktop\\DSA JAVA\\Test1", "text1.text");
        // f1.createNewFile();
        // System.out.println(f1.exists());
        String str[]= f.list();
        for(String ele:str){
            File f1= new File(f, ele);
            if(f1.isFile()){
                System.out.println(ele);
                System.out.println(f1.length());
            }
        }
    }
}
