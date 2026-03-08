import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
        String username = "user<script>";
        boolean loginSuccessful = false;

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9]+", username)
                ? username
                : "unauthorized user";
    }
}
