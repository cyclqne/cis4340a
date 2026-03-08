import java.security.AccessController;
import java.security.PrivilegedAction;

public class R13_SEC01_J {

    public static void main(String[] args) {

        String userInput = System.getProperty("user.home");

        // Noncompliant privileged action
        AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
            System.out.println("Accessing: " + userInput);
            return null;
        });
    }
}
