class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q6 {
    public static void main(String[] args)
            throws InterruptedException {

        MyThread t = new MyThread();

        System.out.println("Before start: " + t.isAlive());

        t.start();

        System.out.println("While running: " + t.isAlive());

        t.join();

        System.out.println("After finish: " + t.isAlive());
    }
}
