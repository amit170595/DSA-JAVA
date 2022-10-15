public class ThreadGroupDemo {
    public static void main(String[] args) {
        ChildThreadGroup ct = new ChildThreadGroup();
        ThreadGroup tg = new ThreadGroup("My Group");
        Thread t = new Thread(tg, ct, "PrepBytes");
        t.start();
        System.out.println(tg.activeCount());
        System.out.println("Main Thread: " + Thread.currentThread().getName());
        System.out.println("Main ThreadGroup Name: " + Thread.currentThread().getThreadGroup());
    }
}

class ChildThreadGroup extends Thread {
    public void run() {
        System.out.println("Child Thread Name: " + Thread.currentThread().getName());
        System.out.println("Child ThreadGroup Name: " + Thread.currentThread().getThreadGroup());
        for (int i = 0; i < 5; i++)
            System.out.println("Child Thread Group");
    }
}