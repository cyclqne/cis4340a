import java.io.FileInputStream;
import java.io.IOException;

public class R12_FIO02_J {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.txt")) {

            int data = fis.read();
            System.out.println(data);

        } catch (IOException e) {
            System.out.println("File error occurred");
        }
    }
}
