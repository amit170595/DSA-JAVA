import java.util.concurrent.CountDownLatch;

class SomeThread1 extends Thread {
    private CountDownLatch latch;

    SomeThread1(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Thread running with thread name: " + Thread.currentThread().getName());
        System.out.println("Thread exection completed");
        System.out.println("********************************");
        latch.countDown();
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);
        SomeThread1 thread1 = new SomeThread1(latch);
        SomeThread1 thread2 = new SomeThread1(latch);
        SomeThread1 thread3 = new SomeThread1(latch);
        SomeThread1 thread4 = new SomeThread1(latch);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am in main Thread");
    }
}
