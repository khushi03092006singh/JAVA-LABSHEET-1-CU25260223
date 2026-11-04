class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running");
    }
}

public class Q8 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("High Priority");
        MyThread t2 = new MyThread("Low Priority");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
    }
}
