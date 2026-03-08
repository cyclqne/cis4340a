import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.IOException;

public class R14_SER01_J implements Serializable {

    private static final long serialVersionUID = 1L;

    private String data = "example";

    private void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException {

        in.defaultReadObject();
    }

    public static void main(String[] args) {
        System.out.println("Serialization example");
    }
}
