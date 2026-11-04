import java.util.Random;

class TaskThread extends Thread {
    TaskThread(String name) {
        super(name);
    }

    public void run() {
        try {
            int time = new Random().nextInt(501);
            Thread.sleep(time);

            System.out.println(getName() +
                " completed after " + time + " ms");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        new TaskThread("Reader").start();
        new TaskThread("Writer").start();
        new TaskThread("Logger").start();
    }
}
