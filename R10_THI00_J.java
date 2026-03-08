public class R10_THI00_J {

    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread running");
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();

        // Noncompliant: calling run() directly
        t.run();
    }
}
