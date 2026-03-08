public class R11_OBJ09_J {

    public static void main(String[] args) {
        String s = "hello";

        // Noncompliant comparison
        if (s.getClass().getName().equals("java.lang.String")) {
            System.out.println("It is a String");
        }
    }
}
