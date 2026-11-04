class PriorityThread extends Thread {
    PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() +
                " Priority: " + getPriority());
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        new PriorityThread("T1", 1).start();
        new PriorityThread("T2", 3).start();
        new PriorityThread("T3", 5).start();
        new PriorityThread("T4", 7).start();
        new PriorityThread("T5", 10).start();
    }
}