import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileAuto {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {
            int bajt;
            while ((bajt = fis.read()) != -1) {
                fos.write(bajt == ' ' ? '-' : bajt);
            }
        } catch (IOException e) {
            System.out.println("Error IO: " + e.getMessage());
        }
    }
}
