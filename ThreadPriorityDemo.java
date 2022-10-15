public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ChildThreadPriority ct = new ChildThreadPriority();
        System.out.println(Thread.currentThread().getName() + "=" + Thread.currentThread().getPriority());
        ct.setPriority(7);
        ct.start();
        for (int i = 0; i < 1000; i++)
            System.out.println("Main Thread Priority " + i);
    }
}

class ChildThreadPriority extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "=" + Thread.currentThread().getPriority());
        for (int i = 0; i < 1000; i++)
            System.out.println("Child Thread Priority " + i);
    }
}