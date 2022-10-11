class ChildThread extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++)
            System.out.println("Child Thread: " + i);
    }
}

public class ExtendingThreads {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        ct.start();
        for (int i = 0; i <= 10000; i++)
            System.out.println("Main Thread: " + i);
    }
}