public class R11_OBJ09_J {

    public static void main(String[] args) {
        String s = "hello";

        // Compliant comparison
        if (s.getClass() == String.class) {
            System.out.println("It is a String");
        }
    }
}
