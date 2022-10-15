class ChildRunnableThread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5; i++)
            System.out.println("Child Runnable Thread");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        ChildRunnableThread ct = new ChildRunnableThread();
        Thread t = new Thread(ct, "PrepBytes");
        t.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main Thread");
    }
}