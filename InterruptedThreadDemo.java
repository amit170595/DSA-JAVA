public class InterruptedThreadDemo {
    public static void main(String[] args) {
        ChildThreadInterrupt cti = new ChildThreadInterrupt();
        cti.start();
        cti.interrupt();
        System.out.println("End of Main Thread");
    }
}

class ChildThreadInterrupt extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread Interrupted: " + i);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got Interrupted");
        }
    }
}