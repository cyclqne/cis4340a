import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
        String username = "user<script>";
        boolean loginSuccessful = false;

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}
