class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Your Name");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
