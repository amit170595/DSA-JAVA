import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread2 extends Thread {
    private String name;

    public SomeThread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting Thread: " + name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Ended: " + name);
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        SomeThread2 thread1 = new SomeThread2("Thread 1");
        SomeThread2 thread2 = new SomeThread2("Thread 2");
        SomeThread2 thread3 = new SomeThread2("Thread 3");
        SomeThread2 thread4 = new SomeThread2("Thread 4");
        SomeThread2 thread5 = new SomeThread2("Thread 5");
        SomeThread2 thread6 = new SomeThread2("Thread 6");
        SomeThread2 thread7 = new SomeThread2("Thread 7");
        SomeThread2 thread8 = new SomeThread2("Thread 8");
        SomeThread2 thread9 = new SomeThread2("Thread 9");
        SomeThread2 thread10 = new SomeThread2("Thread 10");
        SomeThread2 thread11 = new SomeThread2("Thread 11");
        SomeThread2 thread12 = new SomeThread2("Thread 12");
        SomeThread2 thread13 = new SomeThread2("Thread 13");
        SomeThread2 thread14 = new SomeThread2("Thread 14");
        SomeThread2 thread15 = new SomeThread2("Thread 15");
        SomeThread2 thread16 = new SomeThread2("Thread 16");
        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.execute(thread7);
        executorService.execute(thread8);
        executorService.execute(thread9);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);
        executorService.execute(thread13);
        executorService.execute(thread14);
        executorService.execute(thread15);
        executorService.execute(thread16);
        executorService.shutdown();
    }
}
