import java.io.Serializable;

public class R14_SER01_J implements Serializable {

    private static final long serialVersionUID = 1L;

    private String data = "example";

    // Noncompliant serialization method
    public void readObject() {
        System.out.println("Reading object");
    }

    public static void main(String[] args) {
        System.out.println("Serialization example");
    }
}
