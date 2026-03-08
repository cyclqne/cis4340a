import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static void main(String[] args) throws IOException {
        byte[] data = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
        DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));

        long value = getInteger(is);
        System.out.println(value);
    }

    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL;
    }
}
