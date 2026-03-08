import java.io.FileInputStream;
import java.io.IOException;

public class R12_FIO02_J {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("data.txt");

        int data = fis.read();

        System.out.println(data);
    }
}
